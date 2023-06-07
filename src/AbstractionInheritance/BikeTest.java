package AbstractionInheritance;

public class BikeTest {
    public static void main(String[] args) {
       Bicycle b = new Bicycle();
       b.easy();
       b.fast();
       b.ride();
       b.light();

       Bike b2 = new Bicycle();
       b.ride();
       b.easy();
       b.fast();
       b.light();

    }
}
