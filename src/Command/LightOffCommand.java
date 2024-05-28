package Command;

public class LightOffCommand implements DeviceCommand{
    private SmartLight light;

    public LightOffCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
