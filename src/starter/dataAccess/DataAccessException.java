package dataAccess;

/**
 * Indicates there was an error connecting to the database
 */
public class DataAccessException extends Exception{
    /**
     * @param message
     */
    public DataAccessException(String message) {
        super(message);
    }
}
