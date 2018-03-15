package hu.csega.ficbidta.model;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class ModelSaverWriter {

	private StringBuilder builder;
	private OutputStreamWriter streamWriter;
	
	public ModelSaverWriter(StringBuilder builder) {
		this.builder = builder;
	}
	
	public ModelSaverWriter(OutputStreamWriter streamWriter) {
		this.streamWriter = streamWriter;
	}
	
	public ModelSaverWriter(StringBuilder builder, OutputStreamWriter streamWriter) {
		this.builder = builder;
		this.streamWriter = streamWriter;
	}
	
	public void write(String str) {
		if(streamWriter != null) {
			try {
				streamWriter.write(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(builder != null) {
			builder.append(str);
		}
	}
	
	public void flush() {
		if(streamWriter != null) {
			try {
				streamWriter.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
