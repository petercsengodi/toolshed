package hu.csega.toolshed.v1.utilities;

import java.io.OutputStream;

public abstract class ByteArrayBuilderOutputStream extends OutputStream {
	public abstract byte[] buildByteArray();
	public abstract void dispose();
}
