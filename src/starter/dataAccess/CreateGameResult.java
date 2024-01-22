package dataAccess;


/**
 *
 */
public class CreateGameResult {
    private String message;
    private int gameID;
    private String playerColor;

    // Constructors (including default and parameterized constructors)

    /**
     *
     */
    public CreateGameResult() {
    }

    /**
     * @param message
     * @param gameID
     * @param playerColor
     */
    public CreateGameResult(String message, int gameID, String playerColor) {
        this.message = message;
        this.gameID = gameID;
        this.playerColor = playerColor;
    }

    // Getters and setters for the fields

    /**
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */
    public int getGameID() {
        return gameID;
    }

    /**
     * @param gameID
     */
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    /**
     * @return
     */
    public String getPlayerColor() {
        return playerColor;
    }

    /**
     * @param playerColor
     */
    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }
}

