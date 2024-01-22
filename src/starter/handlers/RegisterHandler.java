package handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import dataAccess.RegisterRequest;
import dataAccess.RegisterResult;
import dataAccess.RegisterService;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import java.io.InputStream;
import java.io.InputStreamReader;
import com.google.gson.Gson;

public class RegisterHandler implements HttpHandler {
    private RegisterService registerService; // Inject the service as needed

    public RegisterHandler(RegisterService registerService) {
        this.registerService = registerService;
    }

    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            // Get the request body from the HTTP request and parse it
            try (InputStream requestBody = exchange.getRequestBody()) {
                InputStreamReader reader = new InputStreamReader(requestBody, StandardCharsets.UTF_8);
                Gson gson = new Gson();
                RegisterRequest request = gson.fromJson(reader, RegisterRequest.class);

                // Call the RegisterService to handle the registration request
                RegisterResult result = registerService.register(request);

                // Convert the result to a JSON string
                String response = gson.toJson(result);

                // Set the HTTP response headers
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, response.length());

                // Write the response to the output stream
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes(StandardCharsets.UTF_8));
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception and return an error response
                exchange.sendResponseHeaders(500, 0);
            }
        } else {
            // Handle unsupported HTTP methods (e.g., not POST)
            exchange.sendResponseHeaders(405, 0); // 405 Method Not Allowed
        }
        exchange.close();
    }
}
