package Strategy;

public class EcoFriendly implements TempratureController{
    @Override
    public void regulate() {
        System.out.println("Now the temprature is in Eco-Friendly mode!!!");
    }
}
