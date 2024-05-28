package Adaptor;

public class ThirdPartyDeviceAdaptor implements DeviceAdapter{
    private ThirdPartyDevice thirdPartyDevice;

    public ThirdPartyDeviceAdaptor(ThirdPartyDevice device) {
        this.thirdPartyDevice = device;
    }

    @Override
    public void turnOn() {
        thirdPartyDevice.start();
    }

    @Override
    public void turnOff() {
        thirdPartyDevice.stop();
    }
}
