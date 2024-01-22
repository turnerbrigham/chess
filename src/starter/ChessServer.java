import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import handlers.*;
import dataAccess.*;

//import java.io.IOException;
//import java.io.OutputStream;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import java.net.InetSocketAddress;

public class ChessServer {
    public static void main(String[] args) throws Exception {
        int serverPort = 8080; // You can change the port to your desired value.
        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);

        // services:
        CreateGameService createGameService = new CreateGameService(); // You need to create this service class.
        JoinGameService joinGameService = new JoinGameService(); // You need to create this service class.
        ListGamesService listGamesService = new ListGamesService();
        LoginService loginService = new LoginService(); 

        RegisterService registerService = new RegisterService();
        System.out.println("NOOO yay, registering");
        // Register your handlers
        server.createContext("/db", new ClearApplicationHandler());
        server.createContext("/create-game", new CreateGameHandler(createGameService));
        server.createContext("/join-game", new JoinGameHandler(joinGameService));
        server.createContext("/list-games", new ListGamesHandler(listGamesService));
        server.createContext("/login", new LoginHandler(loginService));
        server.createContext("/logout", new LogoutHandler());
        server.createContext("/register", new RegisterHandler()); //registerService

        server.setExecutor(null); // Default executor

        server.start();
    }

    // Example of a handler
    static class ClearApplicationHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Your logic to clear the database goes here
            // For example, you might call a method to clear the database

            // Check for errors in your logic and return the appropriate response
            boolean success = true; //clearDatabase(); // Replace with your actual database clearing logic

            if (success) {
                sendResponse(exchange, 200, "{success:True}"); //Database cleared successfully
            } else {
                sendResponse(exchange, 500, "Error: Failed to clear the database");
            }
        }
    }



    static class RegisterHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Your logic to clear the database goes here
            // For example, you might call a method to clear the database

            // Check for errors in your logic and return the appropriate response
            boolean success = true; //clearDatabase(); // Replace with your actual database clearing logic

            if (success) {
                sendResponse(exchange, 200, "{success:True}"); //Database cleared successfully
            } else {
                sendResponse(exchange, 500, "Error: Failed to clear the database");
            }
        }
    }



    private static void sendResponse(HttpExchange exchange, int statusCode, String response) throws IOException {
        exchange.sendResponseHeaders(statusCode, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}