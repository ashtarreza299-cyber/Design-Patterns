
void main() {

    Tv tv = new Tv();

    Command turnOnTv = new TurnOnTvCommand(tv);
    Command turnOffTv = new TurnOffTvCommand(tv);

    RemoteControl remoteControl = new RemoteControl(turnOnTv);
    RemoteControl remoteControl2 = new RemoteControl(turnOffTv);

    remoteControl.pressONButton();
    remoteControl2.pressOFFButton();

}
