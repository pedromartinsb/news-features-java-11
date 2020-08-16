import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// strings
		
		var chant = "   USA!!    ";
		System.out.println("chant.repeat(3) = " + chant.repeat(3));
		System.out.println("chant.isBlank() = " + chant.isBlank());
		System.out.println("chant.strip() = " + chant.strip());  // chant.trim()...
		
		
		// lambdas
		
		Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("i got this much money! = " + money);
		
		
		// http client
		
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuider()
				.GET()
				.uri(URI.create("https://www.google.com"))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
		
		// unicode 10
		
		System.out.println("\u20BF"); // cryptocurrencies?
		
		
		// JavascriptEngine...nashorn
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('help, i am dying!');");	
	}
}