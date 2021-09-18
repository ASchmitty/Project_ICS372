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
            ds.send(dpSend);
            System.out.println("Datagram Packet Sent" + dpSend);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
