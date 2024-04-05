package org.astrox.waterutility.exception;

public class ReadingNotFoundException extends RuntimeException{
    public ReadingNotFoundException(String message) {
        super("Meter reading not found");
    }
}
