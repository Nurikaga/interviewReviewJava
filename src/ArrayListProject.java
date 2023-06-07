import java.util.ArrayList;

public class ArrayListProject {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Orange";

        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Watermelon");

        System.out.println(fruitList);
        fruitList.clear();
        System.out.println(fruitList);
    }
}
