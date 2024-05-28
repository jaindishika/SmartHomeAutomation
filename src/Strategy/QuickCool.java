package Strategy;

public class QuickCool implements TempratureController{
    @Override
    public void regulate() {
        System.out.println("Now the temprature is in Quick Cool mode!!!");
    }
}
