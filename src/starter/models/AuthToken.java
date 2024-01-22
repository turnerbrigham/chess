package models;

public class AuthToken {
    private String authToken;
    private String username;

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