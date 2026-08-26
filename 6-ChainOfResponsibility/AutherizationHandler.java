public class AutherizationHandler extends Handler {

    @Override
    public void handle(Request request) {

        if(! request.isAuthenticated()) {

            System.out.println("Autherization Failed");
            return;
        }

        System.out.println("Authentication Passed");

        if(next != null) {

            next.handle(request);
        }
    }
}
