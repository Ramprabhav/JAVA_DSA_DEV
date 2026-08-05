import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpGetRequest {
    public static void main(String[] args) {
        try {
            // Specify the URL to send the GET request
            String url = "https://jsonplaceholder.typicode.com/posts/1";
            // Create a URL object
            URL apiUrl = new URL(url);
          // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();    
            // Set the request method to GET
            connection.setRequestMethod("GET");           
            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);          
            // Read the response from the server
            BufferedReader reader = new BufferedReader (new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            // Print the response
            System.out.println("Response Body:");
            System.out.println(response.toString());       
            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
