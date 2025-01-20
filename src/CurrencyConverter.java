import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    public static void main(String[] args) {
        String apiKey = "fd7d7857307ebdda52677082";
        String endpoint = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        try {

            HttpClient client = HttpClient.newHttpClient();


            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .GET()
                    .build();


            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

