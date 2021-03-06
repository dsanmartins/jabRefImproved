package org.jabref.shared.exception;

/**
 * This exception is thrown in case that {@link DBMSConnectionProperties} does not provide all data needed for a connection.
 */
public class InvalidDBMSConnectionPropertiesException extends Exception {

    public InvalidDBMSConnectionPropertiesException() {
        super("Required connection details not present.");
    }
}
