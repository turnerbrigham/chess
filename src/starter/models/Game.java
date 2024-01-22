package models;

import chess.ChessGame; // Import ChessGame from the correct package

public class Game {
    private int gameID;
    private String whiteUsername;
    private String blackUsername;
    private String gameName;
    private ChessGame game;

    /**
     *
     */
    // Constructors
    public Game() {
        // Default constructor
    }

    /**
     * @param gameID
     * @param whiteUsername
     * @param blackUsername
     * @param gameName
     * @param game
     */
    public Game(int gameID, String whiteUsername, String blackUsername, String gameName, ChessGame game) {
        this.gameID = gameID;
        this.whiteUsername = whiteUsername;
        this.blackUsername = blackUsername;
        this.gameName = gameName;
        this.game = game;
    }

    /**
     * @return
     */
    // Getters
    public int getGameID() {
        return gameID;
    }

    /**
     * @return
     */
    public String getWhiteUsername() {
        return whiteUsername;
    }

    /**
     * @return
     */
    public String getBlackUsername() {
        return blackUsername;
    }

    /**
     * @return
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return
     */
    public ChessGame getGame() {
        return game;
    }

    /**
     * @param gameID
     */
    // Setters
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    /**
     * @param whiteUsername
     */
    public void setWhiteUsername(String whiteUsername) {
        this.whiteUsername = whiteUsername;
    }

    /**
     * @param blackUsername
     */
    public void setBlackUsername(String blackUsername) {
        this.blackUsername = blackUsername;
    }

    /**
     * @param gameName
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * @param game
     */
    public void setGame(ChessGame game) {
        this.game = game;
    }
}
