package Decorator;

public class PowerSaving extends DecoratorDevice{
    public PowerSaving(Feature feature){
        super(feature);
    }
    @Override
    public String implement(){
        return feature.implement() + ", with Power Saving Mode!!!";
    }

}
