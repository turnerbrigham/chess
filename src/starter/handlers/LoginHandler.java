package handlers;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import dataAccess.LoginRequest;
import dataAccess.LoginResult;
import dataAccess.LoginService;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LoginHandler implements HttpHandler {
    private LoginService loginService;
    private Gson gson;

    public LoginHandler(LoginService loginService) {
        this.loginService = loginService;
        this.gson = new Gson();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            // Get the request body from the HTTP request
            try (InputStream requestBody = exchange.getRequestBody()) {
                InputStreamReader reader = new InputStreamReader(requestBody, StandardCharsets.UTF_8);
                LoginRequest request = gson.fromJson(reader, LoginRequest.class);

                // Call the LoginService to perform the login
                LoginResult result = loginService.login(request);

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
