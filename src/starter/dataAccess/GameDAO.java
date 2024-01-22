package dataAccess;


import java.util.HashMap;
import java.util.Map;
import chess.Game;

public class GameDAO {
    private Map<Integer, Game> games = new HashMap<>();
    private int nextGameID = 1;

    /**
     * @param newGame
     * @throws DataAccessException
     */
    public void createGame(Game newGame) throws DataAccessException {
        int gameID = nextGameID++;
        newGame.setGameID(gameID);
        games.put(gameID, newGame );
    }

    /**
     * @param gameID
     * @return
     */
    public Game findGameById(int gameID) {
        return games.get(gameID);
    }

    /**
     * @return
     */
    public Map<Integer, Game> getAllGames() {
        return games;
    }

    /**
     * @param newGame
     */
    public void updateGame(Game newGame) {
        games.put(newGame.getGameID(), newGame );
    }

    /**
     * @param gameID
     */
    public void removeGame(int gameID) {
        games.remove(gameID);
    }
}
