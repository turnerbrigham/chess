package dataAccess;

public class RegisterResult {
    private String message;
    private String authToken;
    private String username;

    /**
     *
     */
    // Constructors (including default and parameterized constructors)
    public RegisterResult() {
    }

    /**
     * @return
     */
    // Getters and setters for the fields
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