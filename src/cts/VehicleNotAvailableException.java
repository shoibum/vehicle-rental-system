package cts.vrs;

public class VehicleNotAvailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleNotAvailableException(String message) {
        super(message);
    }
}
