package Decorator;

public class VacationMode extends DecoratorDevice{
    public VacationMode(Feature feature){
        super(feature);
    }
    @Override
    public String implement() {
        return feature.implement() + ", with vacation Mode";
    }
}
