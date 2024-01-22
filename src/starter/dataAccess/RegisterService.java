package dataAccess;
import models.User;

import java.util.UUID;

public class RegisterService {
    private UserDAO userDAO; // Inject the DAO as needed

    /**
     * @param request
     * @return
     */
    public RegisterResult register(RegisterRequest request) {
        RegisterResult result = new RegisterResult();
        try {
            User newUser = new User();
            newUser.setUsername(request.getUsername());
            newUser.setPassword(request.getPassword());
            newUser.setEmail(request.getEmail());

            userDAO.createUser(newUser);

            result.setAuthToken(generateAuthToken());
            result.setUsername(newUser.getUsername());
        } catch (DataAccessException ex) {
            result.setMessage("Error: User already exists");
        }
        return result;
    }

    /**
     * @return
     */
    private String generateAuthToken() {
        // Implement token generation logic
        String authToken = UUID.randomUUID().toString();
        return authToken;
    }
}
