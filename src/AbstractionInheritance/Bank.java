package AbstractionInheritance;

public abstract class Bank {

    int amt = 100;

    //partial abstraction
    //hiding the implementation logiv -- is called Abstraction
    //Abstraction class can have abs methods and non abs methods
    //can not create an object of abstract class

    public abstract void loan(); // abstract method -- no method body

    // non abstract methods
    public void credit(){
        System.out.println("Bank -- Credit");
    }
    public void debit(){
        System.out.println("Bank -- debit");
    }
}
