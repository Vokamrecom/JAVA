package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpGet {
    DatagramSocket socket = new DatagramSocket();
    byte[] bytes = new byte[10];

    public UdpGet(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }
    public void getMEssages() throws IOException {
        socket.receive(new DatagramPacket(bytes,10));
        String line  = new String(bytes);
        System.out.println(line);
    }
    // 192.168.43.77
    public static void main(String[] args) throws IOException {
        UdpGet udpGet = new UdpGet(6666);
        while(true) {
            udpGet.getMEssages();
        }
    }
}