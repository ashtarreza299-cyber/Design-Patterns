public class Request {

    private boolean isAuthenticated;
    private boolean isAdmin;

    public Request(boolean isAuthenticated, boolean isAdmin) {
        this.isAuthenticated = isAuthenticated;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

}
