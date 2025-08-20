package com.decorator.iostream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        for (int i = off; i < off + bytesRead; i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return bytesRead;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int bytesRead = super.read(b);
        for (int i=0; i<bytesRead; i++){
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return bytesRead;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char)c));
    }
}
