import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 8080));

        Socket socket = serverSocket.accept();

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        String response;
        String request = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!request.equals("Exit")) {
            request = input.readUTF();
            System.out.println("Received client request as ' " + request + "' ");
            response = reader.readLine();
            output.writeUTF(response);
            output.flush();
        }

        input.close();
        socket.close();
    }
}
