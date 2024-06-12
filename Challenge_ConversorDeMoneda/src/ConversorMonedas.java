import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class ConversorMonedas {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/a69ddd3775ca3031843a2d2a/latest/";

    public void convertirMoneda(String monedaOrigen, String monedaDestino) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            String apiUrl = API_URL + monedaOrigen;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject respuestaJson = new JSONObject(response.body());
            JSONObject tasasConversion = respuestaJson.getJSONObject("conversion_rates");

            if (tasasConversion.has(monedaDestino)) {
                double tasa = tasasConversion.getDouble(monedaDestino);
                System.out.println("1 " + monedaOrigen + " = " + tasa + " " + monedaDestino);
            } else {
                System.out.println("La conversión de " + monedaOrigen + " a " + monedaDestino + " no está disponible.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}