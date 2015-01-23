package hu.csega.json.console;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;


public class JsonConsole extends JFrame implements KeyListener {
	
	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;

	private JTextField input = new JTextField();
	private TextArea output = new TextArea();
	
	public JsonConsole() {
		super("Json console powered by Rhino Script");
		
		input.addKeyListener(this);
		input.setPreferredSize(new Dimension(600, 60));
		output.setPreferredSize(new Dimension(600, 400));
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(input, BorderLayout.NORTH);
		getContentPane().add(output, BorderLayout.SOUTH);
		getContentPane().setPreferredSize(new Dimension(600, 500));
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode()==KeyEvent.VK_ENTER){
	    	doit();
	    }
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	private void doit() {
		try {
			setUpScriptEngine();

			String inputText = input.getText();
			if(inputText != null) {
				inputText = inputText.trim();
				if(inputText.length() > 0) {
					
					Object ret;
					if(tokenizer.checkFirstWord(inputText)) {
						String[] params = tokenizer.tokenize(inputText);
						String cmd = "main." + params[0] + "(";
						for(int i = 1; i < params.length; i++) {
							if(i > 1) {
								cmd += ", ";
							}
							cmd += '\"' + params[i] + "\"";
						}
						
						cmd += ")";
						
						ret = cx.evaluateString(scope, cmd, "console", 1, null);
					} else {
						ret = cx.evaluateString(scope, inputText, "console", 1, null);
					}
					
					
					if(ret == null) {
						output.setText("NULL");
					} else {
						
						if(ret instanceof NativeJavaObject) {
							NativeJavaObject object = (NativeJavaObject) ret;
							ret = object.getDefaultValue(null);
						}
						
						String retString = ret.toString();
						if(retString == null) {
							output.setText("NULL String");
						} else if(retString.trim().length() == 0) {
							output.setText("Empty String");
						} else {
							output.setText(retString);
						}
					}
				}
			}
			
			input.setText("");
		} catch(Exception ex) {
			output.setText(errorAndStackTrace(ex));
		}
	}
	
	public static String errorAndStackTrace(Exception e) {
		StringBuilder builder = new StringBuilder();
		builder.append("Exception occured: ");
		
		Throwable t = e;
		while(t != null) {
			builder.append("\n");
			builder.append(t.getClass().getName());
			builder.append(":\n");
			builder.append(t.getMessage());
			builder.append("\n");
			
			for(StackTraceElement ste : t.getStackTrace()) {
				String line = " at " + ste.getClassName() + "." + ste.getMethodName() + 
						" (" + ste.getFileName() + ":" + ste.getLineNumber() + ")\n";
				builder.append(line);
			}
			
			t = (t.getCause() != t ? t.getCause() : null);
		}
		
		return builder.toString();
	}


	private void setUpScriptEngine() throws ScriptException {
		if(service == null) {
			service = new MainConsoleService();
		}
		
		if(cx == null) {
			cx = Context.enter();
			cx.setLanguageVersion(Context.VERSION_1_8);
			scope = cx.initStandardObjects();
			scope.put("main", scope, service);
			// cx.evaluateString(scope, "var n = new RegExp(regex,\"g\");", "pattern", 1, null);
		}
		
		if(tokenizer == null) {
			tokenizer = new ConsoleTokenizer();
		}
	}
	
	private Context cx;
	private Scriptable scope;
	private ConsoleTokenizer tokenizer;
	private MainConsoleService service;

	public static void main(String[] args) throws Exception {
		JsonConsole console = new JsonConsole();
		console.setVisible(true);
	}

}
