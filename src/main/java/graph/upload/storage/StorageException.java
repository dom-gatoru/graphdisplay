package graph.upload.storage;

public class StorageException extends RuntimeException {

    private static final long serialVersionUID = 8622570835465035049L;

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}