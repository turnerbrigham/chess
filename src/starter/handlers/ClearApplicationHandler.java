package handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;


import java.io.OutputStream;


public class ClearApplicationHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // Your logic to clear the application data goes here
        // For example, you might call a method from your ClearApplicationHandler class

        String response = "Application data cleared 4.";
        sendResponse(exchange, response);
    }

    private static void sendResponse(HttpExchange exchange, String response) throws IOException {
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
//
//public class ClearApplicationHandler implements HttpHandler {
//
//    @Override
//    public void handle(HttpExchange exchange) throws IOException {
//        System.out.println("yay, clearing");
//        if ("POST".equals(exchange.getRequestMethod())) {
//            // Perform application data cleanup or clearing logic here
//            // You can clear databases, reset application state, or perform any other cleanup tasks.
//
//            // Send a response to indicate the operation was successful
//            String response = "Application data has been cleared or reset.";
//            exchange.getResponseHeaders().set("Content-Type", "text/plain");
//            exchange.sendResponseHeaders(200, response.length());
//
//            // Write the response to the output stream
//            exchange.getResponseBody().write(response.getBytes(StandardCharsets.UTF_8));
//        } else {
//            // Handle unsupported HTTP methods (e.g., not POST)
//            exchange.sendResponseHeaders(405, 0); // 405 Method Not Allowed
//        }
//        exchange.close();
//    }
//}
