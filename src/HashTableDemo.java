import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        marks.put("Naveen", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Peter", 400);
        marks.put("Robby", 600);


        System.out.println(marks.get("Naveen"));
        System.out.println(marks.get("Peter"));

    }
}
