
public class TurnOnTvCommand implements Command{

    private Tv tv;

    public TurnOnTvCommand(Tv tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
