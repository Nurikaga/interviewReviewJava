package StaticAndNonStaticConcept;

public class Static {

    // global variables: the scope of global vars will be available across all the fuctions with some conditions
    String name = "Tom"; // non static global var
    static int age = 25; // static global var

    public static void main(String[] args) {
        //how to call static methods and vars?
        //1. direct calling:
        sum();

        // 2. calling by classname:
       Static.sum();

        System.out.println(age);
        System.out.println(Static.age);

        // how to call non static methods and vars

        Static obj = new Static();
        obj.sendMAil();
        System.out.println(obj.name);

        // can I access ststic methods by using object reference? yes
        obj.sum(); // warning will be given

    }
    public void sendMAil(){
        System.out.println("send mail method");
    }
    public static void sum(){
        System.out.println("Sum method");
    }
}
