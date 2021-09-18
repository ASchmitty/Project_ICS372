package com.sendandreceive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Application {
    public static void main(String[] args) throws IOException {
        Sender send = new Sender();
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        try {
            DatagramPacket dpSend =
                    new DatagramPacket(send.getfBytes(), send.getBytes().length, ip, 1234);
            DatagramPacket dpReceive =
                    new DatagramPacket(new byte[1024],1024);

            ds.send(dpSend);
            System.out.println("Datagram Packet Sent" + dpSend.getData());

            ds.receive(dpReceive);
            System.out.println("Datagram Packet Sent" + dpReceive.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
