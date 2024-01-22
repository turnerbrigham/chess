package dataAccess;


public class LoginResult {
    private String message;
    private String authToken;
    private String username;

    // Constructors (including default and parameterized constructors)

    /**
     *
     */
    public LoginResult() {
    }

    /**
     * @param message
     * @param authToken
     * @param username
     */
    public LoginResult(String message, String authToken, String username) {
        this.message = message;
        this.authToken = authToken;
        this.username = username;
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
    public String getAuthToken() {
        return authToken;
    }

    /**
     * @param authToken
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
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

