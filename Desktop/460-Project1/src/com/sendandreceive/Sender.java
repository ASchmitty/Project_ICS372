package com.sendandreceive;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Sender {
    private File file = new File("/Users/austinthor/Desktop/Marvel.jpeg"); //creating file object
    private long length = file.length();
    private byte[] bytes = new byte[(int) (length / 12)];
    private byte[] fBytes = Files.readAllBytes(file.toPath());

    public Sender() throws IOException {}

    public File getFile() {return file;}

    public byte[] getBytes() {return bytes;}

    public byte[] getfBytes() {return fBytes;}
}
