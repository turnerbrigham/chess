package dataAccess;

import models.AuthToken;

import java.util.HashMap;
import java.util.Map;

public class AuthTokenDAO {
    private Map<String, AuthToken> authTokens = new HashMap<>();

    /**
     * @param authToken
     * @throws DataAccessException
     */
    public void createAuthToken(AuthToken authToken) throws DataAccessException {
        if (!authTokens.containsKey(authToken.getAuthToken())) {
            authTokens.put(authToken.getAuthToken(), authToken);
        } else {
            throw new DataAccessException("AuthToken already exists.");
        }
    }

    /**
     * @param authToken
     * @return
     */
    public AuthToken findAuthToken(String authToken) {
        return authTokens.get(authToken);
    }

    // Implement similar methods for updating, deleting, and querying AuthTokens
}
