package handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LogoutHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("POST".equals(exchange.getRequestMethod())) {
            // Implement user logout logic here
            // You can clear the user's session, revoke their authentication token, or perform any other necessary actions.

            // Send a response to indicate the user has been logged out
            String response = "User has been logged out.";
            exchange.getResponseHeaders().set("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, response.length());

            // Write the response to the output stream
            exchange.getResponseBody().write(response.getBytes(StandardCharsets.UTF_8));
        } else {
            // Handle unsupported HTTP methods (e.g., not POST)
            exchange.sendResponseHeaders(405, 0); // 405 Method Not Allowed
        }
        exchange.close();
    }
}
