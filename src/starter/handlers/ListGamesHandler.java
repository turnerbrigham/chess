package handlers;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import dataAccess.ListGamesRequest;
import dataAccess.ListGamesResult;
import dataAccess.ListGamesService;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ListGamesHandler implements HttpHandler {
    private ListGamesService ListGamesService;
    private Gson gson;

    public ListGamesHandler(ListGamesService ListGamesService) {
        this.ListGamesService = ListGamesService;
        this.gson = new Gson();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            // Call the ListGamesService to retrieve the list of games
            ListGamesResult result = ListGamesService.ListGames(new ListGamesRequest());

            // Convert the result to a JSON string
            String response = gson.toJson(result);

            // Set the HTTP response headers
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length());

            // Write the response to the output stream
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes(StandardCharsets.UTF_8));
            }
        } else {
            // Handle unsupported HTTP methods (e.g., not GET)
            exchange.sendResponseHeaders(405, 0); // 405 Method Not Allowed
        }
        exchange.close();
    }
}
