package com.sendandreceive;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

    public static void main(String[] args) throws IOException, IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        Sender send = new Sender();
        byte[] receive = new byte[(int) send.getFile().length()];
        DatagramPacket dpReceive = null;

        while (true)
        {
            //create a DatgramPacket to receive the data.
            dpReceive = new DatagramPacket(receive, receive.length);

            //receive the data in byte buffer.
            ds.receive(dpReceive);

            String temp = new String(dpReceive.getData(), 0, dpReceive.getLength() );
            System.out.println("Client:-" + temp);

            String filePath = "/Users/austinthor/Downloads/newMarvel.jpeg";
            File newFile = new File(filePath);
            newFile.createNewFile();

            try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filePath))) {
                out.write(receive);
            }
        }
    }
}
