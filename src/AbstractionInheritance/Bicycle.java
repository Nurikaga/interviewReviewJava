package AbstractionInheritance;

public class Bicycle implements Bike{
    @Override
    public void ride() {
        System.out.println("riding Bike");
    }

    @Override
    public void fast() {
        System.out.println("Bike is fast");
    }

    @Override
    public void easy() {
        System.out.println("Bike is easy to ride");
    }
    public void light(){
        System.out.println("Bicycle is very light");
    }
}
