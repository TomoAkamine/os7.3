import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class send {
    public static void main(String[] args) {
        try {
            int port = 8888;
            String dataToSend = "OS_lecture 7.3";
            byte[] data = dataToSend.getBytes("UTF-8");
            InetAddress address = InetAddress.getByName("239.1.14.126");
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            MulticastSocket socket = new MulticastSocket();
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
