import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8080);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        String response;
        String request = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!request.equals("Exit")){
            request = reader.readLine();
            output.writeUTF(request);
            response = input.readUTF();
            System.out.println("Received responce as ' " + response + "' ");
            output.flush();
        }

        input.close();
        socket.close();
    }
}
