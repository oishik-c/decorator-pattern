package com.decorator.iostream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CaesarCipherInputStream extends FilterInputStream {
    public CaesarCipherInputStream(InputStream in) {
        super(in);
    }

    private int RotateChar(int ch) {
        if ('A' <= ch && ch <= 'Z'){
            ch = 'A' + (ch-'A' + 13)%26;
        } else if ('a' <= ch && ch <= 'z') {
            ch = 'A' + (ch-'a' + 13)%26;
        }

        return ch;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : (char)(RotateChar(c)));
    }

    @Override
    public int read(byte[] b) throws IOException {
        int bytesRead = super.read(b);
        for (int i=0; i<bytesRead; i++){
            b[i] = (byte)(RotateChar(b[i]));
        }
        return bytesRead;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        for(int i=off; i<off+bytesRead; i++){
            b[i] = (byte)(RotateChar(b[i]));
        }
        return bytesRead;
    }
}

