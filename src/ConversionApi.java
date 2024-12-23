import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionApi {
    private HttpClient client;

    public ConversionApi(){
        client = HttpClient.newHttpClient();
    }
    public String LlamarApi(String local, String conver, double monto) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/edafa679a9c67d9774d3772c/pair/" +
                local+"/"+conver+"/"+monto;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String>response =client.send(request,
                HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return json;
    }
}
