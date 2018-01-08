package graph.upload.storage;

public class StorageFileNotFoundException extends StorageException {

    private static final long serialVersionUID = 8149532792177958009L;

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
