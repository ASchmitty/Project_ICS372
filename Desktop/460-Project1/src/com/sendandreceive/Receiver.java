package com.sendandreceive;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {

    public static void main(String[] args) throws IOException, IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        Sender send = new Sender();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] receive = new byte[(int) send.getFile().length()];

        while (true)
        {
            //create a DatgramPacket to receive the data.
            DatagramPacket dpReceive =
                    new DatagramPacket(receive, receive.length);

            //receive the data in byte buffer.
            ds.receive(dpReceive);
            String temp = new String(dpReceive.getData(), 0, dpReceive.getLength() );
            System.out.println("Client:-" + temp);

            DatagramPacket dpSend =
                    new DatagramPacket(receive, receive.length, ip, 1234);
            //ds.send(dpSend);
            String filePath = "/Users/austinthor/Downloads/newMarvel.jpeg";
            File newFile = new File(filePath);
            newFile.createNewFile();

            //Writes output to .jpeg file
            try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filePath))) {
                out.write(receive);
            }
        }
    }
}
