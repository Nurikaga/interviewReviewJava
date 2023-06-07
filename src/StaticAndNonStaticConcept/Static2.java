package StaticAndNonStaticConcept;

import java.sql.SQLOutput;

public class Static2 {
String name = "Nur";
static int age = 36;
static String subject = "Math";

    public static void main(String[] args) {
ageInfo();
getSubject();
System.out.println();
    }
    public void enterName(){
        System.out.println("Enter you name: ");
    }
    public static void ageInfo(){
        System.out.println("Enter your age: ");
    }
    public static void getSubject(){
        System.out.println("Pick your subject");
    }
    }



