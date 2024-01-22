package dataAccess;

import chess.Game;

public class CreateGameService {
    /**
     *
     */
    private GameDAO gameDAO; // You'll need to inject the DAO

    /**
     * @param request
     * @return
     */
    public CreateGameResult CreateGame(CreateGameRequest request) {
        CreateGameResult result = new CreateGameResult();
        //try {
            Game game = gameDAO.findGameById(request.getGameID());

            if (game != null) {
                if (request.getPlayerColor() != null) {
                    if (request.getPlayerColor().equalsIgnoreCase("WHITE") && game.getWhiteUsername() == null) {
                        game.setWhiteUsername(request.getUsername());
                    } else if (request.getPlayerColor().equalsIgnoreCase("BLACK") && game.getBlackUsername() == null) {
                        game.setBlackUsername(request.getUsername());
                    } else {
                        result.setMessage("Error: Already taken");
                        return result;
                    }
                }
                // Additional logic for Createing the game
            } else {
                result.setMessage("Error: Bad request");
            }
        //} catch (DataAccessException ex) {
        //    result.setMessage("Error: Description");
        //}
        return result;
    }
}