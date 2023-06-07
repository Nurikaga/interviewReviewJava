package AbstractionInheritance;

public class TestCar {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();


        Car c= new Bmw();  // dynamic Polymorphism (top casting)
        c.start();
        c.stop();
        c.refuel();

    }
}
