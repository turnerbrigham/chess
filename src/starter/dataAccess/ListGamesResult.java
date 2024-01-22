package dataAccess;
import chess.Game;
import java.util.List;
import java.util.Map;

public class ListGamesResult {
    private Map<Integer, Game> games; // Assuming Game is a class that represents a game

    /**
     * @param games
     */
    public ListGamesResult(Map<Integer, Game> games) {
        this.games = games;
    }

    /**
     * @return
     */
    public Map<Integer, Game> getGames() {
        return games;
    }

    /**
     * @param games
     */
    public void setGames(Map<Integer, Game> games) {
        this.games = games;
    }
}