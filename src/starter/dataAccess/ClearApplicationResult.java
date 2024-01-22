
package dataAccess;

public class ClearApplicationResult {
    private boolean success;
    private String message;

    /**
     * @param success
     * @param message
     */
    public ClearApplicationResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * @return
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

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
}