package dataAccess;
import java.util.UUID;


import models.User;
//import models.User;

public class LoginService {
    private UserDAO userDAO; // You'll need to inject the DAO

    /**
     * @param request
     * @return
     */
    public LoginResult login(LoginRequest request) {
        LoginResult result = new LoginResult();
        ///try {
            User user = userDAO.findUserByUsername(request.getUsername());
            if (user != null && user.getPassword().equals(request.getPassword())) {
                // Login successful
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

