package Command;

public class RemoteController {
    private DeviceCommand command;

    public void setCommand(DeviceCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
