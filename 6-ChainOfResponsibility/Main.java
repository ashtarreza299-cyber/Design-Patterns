



void main () {

    Request request = new Request(true, false);
    Handler authHandler = new AuthenticationHandler();
    Handler autherHandler = new AutherizationHandler();
    Handler logHandler = new LoggingHandler();
    Handler finalHandler = new FinalHandler();

    authHandler.setNext(autherHandler);
    autherHandler.setNext(logHandler);
    logHandler.setNext(finalHandler);

    authHandler.handle(request);

}
