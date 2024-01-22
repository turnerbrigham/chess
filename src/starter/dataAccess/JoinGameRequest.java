package dataAccess;


public class JoinGameRequest {
    private int gameID;
    private String playerColor;
    private String username;

    // Constructors (including default and parameterized constructors)

    /**
     *
     */
    public JoinGameRequest() {
    }

    /**
     * @param gameID
     * @param playerColor
     * @param username
     */
    public JoinGameRequest(int gameID, String playerColor, String username) {
        this.gameID = gameID;
        this.playerColor = playerColor;
        this.username = username;
    }

    // Getters and setters for the fields

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

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
