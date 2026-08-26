public class AuthenticationHandler extends Handler {


    @Override
    public void handle(Request request) {


        if(!request.isAuthenticated()) {

            System.out.println("Access denied");
            return;
        }

        System.out.println("Authentication Passed");

        if(next != null) {

            next.handle(request);
        }

    }
}
