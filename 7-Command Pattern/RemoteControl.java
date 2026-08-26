
public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressONButton() {
        command.execute();
    }

    public void pressOFFButton() {
        command.execute();
    }


}
