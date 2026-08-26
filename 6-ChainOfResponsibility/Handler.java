
public abstract class Handler {

    protected Handler next;

    // pass it to next class
    public void setNext(Handler next) {

        this.next = next;
    }

    // handle request
    public abstract void handle(Request request);
}
