package dataAccess;

import models.User;

import java.util.UUID;
//import models.User;

public class LogoutService {
    private UserDAO userDAO; // You'll need to inject the DAO

    /**
     * @param request
     * @return
     */
    public LogoutResult Logout(LogoutRequest request) {
        LogoutResult result = new LogoutResult();
        ///try {
            User user = userDAO.findUserByUsername(request.getUsername());
            if (user != null && user.getPassword().equals(request.getPassword())) {
                // Logout successful
                result.setAuthToken(generateAuthToken());
                result.setUsername(user.getUsername());
            } else {
                result.setMessage("Error: Unauthorized");
            }
        //} catch (DataAccessException ex) {
        //    result.setMessage("Error: Description");
        //}
        return result;
    }

    /**
     * @return
     */
    private String generateAuthToken() {
        // Implement token generation logic (as shown in a previous response)
        String authToken = UUID.randomUUID().toString();
        return authToken;
    }
}

