import Adaptor.DeviceAdapter;
import Adaptor.ThirdPartyDevice;
import Adaptor.ThirdPartyDeviceAdaptor;
import Command.*;
import Decorator.PowerSaving;
import Decorator.SmartDevice;
import Decorator.VacationMode;
import Strategy.EcoFriendly;
import Strategy.QuickCool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Strategy Pattern
        var regulator1 = new EcoFriendly();
        var regulator2 = new QuickCool();
        regulator1.regulate();
        regulator2.regulate();
//        Decorator Pattern
          var DecorateDevice = new SmartDevice();
          var powersaving = new PowerSaving(DecorateDevice);
          var vacation = new VacationMode(powersaving);
          System.out.println(vacation.implement());
//      Adapator
        ThirdPartyDevice thirdPartyDevice = new ThirdPartyDevice();
        DeviceAdapter adapter = new ThirdPartyDeviceAdaptor(thirdPartyDevice);

        adapter.turnOn();
        adapter.turnOff();
//        Command
        SmartLight livingRoomLight = new SmartLight();
        DeviceCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        DeviceCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        RemoteController remote = new RemoteController();
        remote.setCommand(lightOnCommand);
        remote.pressButton();
        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }

}