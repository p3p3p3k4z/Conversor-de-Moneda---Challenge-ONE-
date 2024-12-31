import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ServicioConversion {
    private final ClienteApi clienteApi;

    public ServicioConversion(ClienteApi clienteApi) {
        this.clienteApi = clienteApi;
    }

    /**
     * Convierte una cantidad de una moneda base a una moneda deseada.
     *
     * @param monedaInicial    Código de la moneda inicial "USD"
     * @param monedaFinal      Código de la moneda final "EUR"

     */
    public double convertirMoneda(String monedaInicial, String monedaFinal, double cantidad) {
        try {
            // Obtener la respuesta JSON de la API
            String respuestaJson = clienteApi.obtenerTasasDeCambio(monedaInicial);

            JsonObject objetoJson = JsonParser.parseString(respuestaJson).getAsJsonObject();
            JsonObject tasasDeCambio = objetoJson.getAsJsonObject("conversion_rates");

            // Verificar si la moneda objetivo está disponible
            if (tasasDeCambio.has(monedaFinal)) {
                double tasa = tasasDeCambio.get(monedaFinal).getAsDouble();
                return cantidad * tasa;
            } else {
                System.err.println("La moneda objetivo no está disponible.");
                return -1;
            }
        } catch (Exception e) {
            System.err.println("Error al realizar la conversión: " + e.getMessage());
            return -1;
        }
    }
}
