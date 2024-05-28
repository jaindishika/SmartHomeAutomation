package Decorator;

public abstract class DecoratorDevice implements Feature{
    protected Feature feature;
    public DecoratorDevice(Feature feature){
        this.feature = feature;
    }
    @Override
    public String implement() {
        return feature.implement();
    }
}
