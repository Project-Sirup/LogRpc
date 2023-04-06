package sirup.service.log.rpc.client;

public class ConsoleFallback implements Fallback {

    @Override
    public void use(String message) {
        System.out.println(message);
    }
}
