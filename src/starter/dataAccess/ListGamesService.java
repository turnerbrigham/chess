
package dataAccess;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

import chess.Game;

public class ListGamesService {
    private GameDAO gameDAO; // You'll need to inject the DAO

    /**
     * @param request
     * @return
     */
    public ListGamesResult ListGames(ListGamesRequest request) {
        Map<Integer, Game> games = gameDAO.getAllGames(); // You need to implement this method in GameDAO

        // You can filter or process the list of games based on the request parameters if needed.

        ListGamesResult result = new ListGamesResult(games);
        return result;
    }
}