public class LoggingHandler extends Handler {


    @Override
    public void handle(Request request) {

        System.out.println("Access Logging");

        if(next != null)
            next.handle(request);
    }
}
