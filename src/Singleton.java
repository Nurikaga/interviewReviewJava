import javax.imageio.stream.ImageInputStream;

public class Singleton {
    // In OOP, a singleton class is a class that can have only once object(instance of the class) at a time
    // How to design singleton class:
    // 1. make constructor as private
    // 2. write public static method that has return type of object of this singleton class(Lazy initialization
    public static void main (String[]args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        (x.str) = (x.str).toUpperCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str = (z.str).toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
    private static Singleton singleton_instance = null;
    public String str;

    private Singleton() {
        str = "Hey, I am using singleton class pattern";
    }
    public static Singleton getInstance() {
        if (singleton_instance == null) {
            singleton_instance = new Singleton();
        }
            return singleton_instance;
        }}



