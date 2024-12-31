import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//conectar a la api y obtener la moneda
public class ClienteApi {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "b01f69d0f905fdae6f6017b5";

    public String obtenerTasasDeCambio(String monedaBase) throws Exception {
        String urlCompleta = API_URL + API_KEY + "/latest/" + monedaBase;
        URL url = new URL(urlCompleta);

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        try (InputStreamReader lector = new InputStreamReader(conexion.getInputStream())) {
            StringBuilder respuesta = new StringBuilder();
            int dato;
            while ((dato = lector.read()) != -1) {
                respuesta.append((char) dato);
            }
            return respuesta.toString();
        }
    }
}
