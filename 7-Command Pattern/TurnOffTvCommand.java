
public class TurnOffTvCommand implements Command{

    private Tv tv;

    public TurnOffTvCommand(Tv tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.turnOff();
    }
}
