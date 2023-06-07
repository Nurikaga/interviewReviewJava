package Constructors;

public class Person {
    public String firstName;
       public  String lastName;
       public int age;

    public Person(){  //1
        System.out.println("Empty constructor");
    }

    public Person(String firstName, int age){  // 2
        System.out.println("Inside 2 arguments");
this.firstName = firstName;
this.age = age;
    }
    public Person(String firstName, String lastName, int age) {  // 3
        System.out.println("Inside 3 arguments");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void printFullName() {  //4
        System.out.println(firstName + " " + lastName);
    }
    public String getFullDetails() {  //5
        String res = firstName + " " + lastName + " " + age;
        return res;
    }
    public void increaseAge(int amount) {   //6
        age += amount;
    }

    }

