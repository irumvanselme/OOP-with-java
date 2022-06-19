import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://irumvanselme-apis.herokuapp.com/api/messages");
        URLConnection connection = url.openConnection();
        connection.connect();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = reader.readLine()) != null){
            System.out.println(inputLine);
        }

        reader.close();
    }
}
