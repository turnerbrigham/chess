package dataAccess;

import models.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> users = new HashMap<>();

    /**
     * @param user
     * @throws DataAccessException
     */
    public void createUser(User user) throws DataAccessException {
        if (!users.containsKey(user.getUsername())) {
            users.put(user.getUsername(), user);
        } else {
            throw new DataAccessException("User already exists.");
        }
    }

    /**
     * @param username
     * @return
     */
    public User findUserByUsername(String username) {
        return users.get(username);
    }

    // Implement similar methods for updating, deleting, and querying users

}
