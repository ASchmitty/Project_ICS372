package com.sendandreceive;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Sender {
    private File file = new File("/Users/austinthor/Desktop/Marvel.jpeg"); //creating file object
    private long length = file.length();
    private byte[] bytes = new byte[(int) (length / 12)];
    private byte[] fBytes = Files.readAllBytes(file.toPath());

    public Sender(File file, long length, byte[] bytes, byte[] fBytes) throws IOException {
        this.file = file;
        this.length = length;
        this.bytes = bytes;
        this.fBytes = fBytes;
    }

    public Sender() throws IOException {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getfBytes() {
        return fBytes;
    }

    public void setfBytes(byte[] fBytes) {
        this.fBytes = fBytes;
    }
}
