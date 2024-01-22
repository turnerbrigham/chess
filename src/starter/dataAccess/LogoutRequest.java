package dataAccess;


public class LogoutRequest {
    private String username;
    private String password;

    // Constructors (including default and parameterized constructors)

    /**
     *
     */
    public LogoutRequest() {
    }

    /**
     * @param username
     * @param password
     */
    public LogoutRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for the fields

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

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

