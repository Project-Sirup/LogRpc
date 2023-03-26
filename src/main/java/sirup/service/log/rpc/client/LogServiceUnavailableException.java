package sirup.service.log.rpc.client;

public class LogServiceUnavailableException extends RuntimeException {
    public LogServiceUnavailableException() {
        super();
    }
    public LogServiceUnavailableException(String message) {
        super(message);
    }
}
