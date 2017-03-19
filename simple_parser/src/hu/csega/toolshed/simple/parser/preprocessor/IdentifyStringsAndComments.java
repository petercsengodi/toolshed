package hu.csega.toolshed.simple.parser.preprocessor;

import hu.csega.toolshed.simple.parser.helper.CharacterConstantExpression;
import hu.csega.toolshed.simple.parser.helper.CodeIterator;
import hu.csega.toolshed.simple.parser.helper.CommentExpression;
import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.StringExpression;
import hu.csega.toolshed.simple.parser.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class IdentifyStringsAndComments extends PreProcessorStep {
	private boolean stringStarted = false;
	private boolean characterStarted = false;
	private boolean internalCommentStarted = false;
	private boolean externalCommentStarted = false;
	private char c = 0;
	private char lastCharacter = 0;
	private boolean skipNext = false;
	private boolean processableItemFound = false;

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks, UnprocessedText text) throws PreProcessorException {

		List<ExpressionWithPositions> ret = new ArrayList<ExpressionWithPositions>();

		// Strings may be only in one row
		for(ExpressionWithPositions chunk : chunks) {
			if(chunk.processable()) {
				CodeIterator it = chunk.iterator(text);
				Point startPosition = it.getPosition();
				Point lastPosition = new Point(0, 0);

				processableItemFound = false;
				skipNext = false;
				stringStarted = false;
				characterStarted = false;
				internalCommentStarted = false;
				externalCommentStarted = false;
				lastCharacter = 0;

				while(it.hasNext()) {
					lastPosition.x = it.getActualColumn();
					lastPosition.y = it.getActualRow();
					c = it.next();

					if(nothingStarted() && !enabledCharacter(c)) {
						throw new PreProcessorException("Illegal character!", it.getPosition());
					} else if(c == '\n' && stringStarted) {
						throw new PreProcessorException("String is not closed!", it.getPosition());
					} else if(c == '\n' && characterStarted) {
						throw new PreProcessorException("Character constant is not closed!", it.getPosition());
					} else if(c == '\n' && internalCommentStarted) {
						// do nothing
					} else if(c == '\n' && externalCommentStarted) {
						// this is how external comments are closed (with a new line)
						ret.add(new CommentExpression(startPosition, lastPosition));
						startPosition = it.getPosition();
						externalCommentStarted = false;
					} else if(nothingStarted() && c == '\"') {
						processableItemFound = true;
						stringStarted = true;
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
							startPosition.x = lastPosition.x;
							startPosition.y = lastPosition.y;
						}
					} else if(nothingStarted() && c == '\'') {
						processableItemFound = true;
						characterStarted = true;
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
							startPosition.x = lastPosition.x;
							startPosition.y = lastPosition.y;
						}
					} else if(stringStarted && c == '\"' && !skipNext) {
						ret.add(new StringExpression(startPosition, it.getPosition()));
						startPosition = it.getPosition();
						stringStarted = false;
						skipNext = false;
					} else if(characterStarted && c == '\'' && !skipNext) {
						ret.add(new CharacterConstantExpression(startPosition, it.getPosition()));
						startPosition = it.getPosition();
						characterStarted = false;
						skipNext = false;
					} else if((stringStarted || characterStarted) && c == '\\') {
						skipNext = !skipNext;
					} else if((stringStarted || characterStarted) && skipNext) {
						skipNext = false;
					} else if(nothingStarted() && lastCharacter == '/' && c == '/') {
						processableItemFound = true;
						externalCommentStarted = true;
						Point lastPosPointMinusOne = new Point(lastPosition.x - 1, lastPosition.y);
						if(isAfter(lastPosPointMinusOne, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosPointMinusOne));
							startPosition.x = lastPosPointMinusOne.x;
							startPosition.y = lastPosPointMinusOne.y;
						}
					} else if(nothingStarted() && lastCharacter == '/' && c == '*') {
						processableItemFound = true;
						internalCommentStarted = true;
						Point lastPosPointMinusOne = new Point(lastPosition.x - 1, lastPosition.y);
						if(isAfter(lastPosPointMinusOne, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosPointMinusOne));
							startPosition.x = lastPosPointMinusOne.x;
							startPosition.y = lastPosPointMinusOne.y;
						}
					} else if(internalCommentStarted && lastCharacter == '*' && c == '/') {
						internalCommentStarted = false;
						ret.add(new CommentExpression(startPosition, it.getPosition()));
						startPosition = it.getPosition();
					} else {
						// do nothing
					}

					lastCharacter = c;
				}

				if(processableItemFound) {
					if(stringStarted) {
						throw new PreProcessorException("String is not closed!", it.getPosition());
					} else if(characterStarted) {
						throw new PreProcessorException("Character constant is not closed!", it.getPosition());
					} else if(internalCommentStarted) {
							throw new PreProcessorException("Comment is not closed!", it.getPosition());
					} else if(externalCommentStarted) {
						lastPosition = it.getPosition();
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new CommentExpression(startPosition, lastPosition));
						}
					} else {
						lastPosition = it.getPosition();
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
						}
					}
				} else {
					// no processable item found
					ret.add(chunk);
				}
			} else {
				// chunk is not processable further
				ret.add(chunk);
			}
		}

		return ret;
	}

	private boolean nothingStarted() {
		return !externalCommentStarted && !internalCommentStarted && !characterStarted && !stringStarted;
	}

	private boolean enabledCharacter(char c) {
		return Character.isWhitespace(c) || Character.isDigit(c) || Character.isLetter(c) ||
				"*|#&@$^~?!:`.;,+-_%/\\\"\'()[]{}<=>".indexOf(c) > -1;
	}
}
