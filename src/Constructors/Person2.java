package Constructors;

import org.w3c.dom.ls.LSOutput;

public class Person2 {
    public static void main(String[] args) {


        Person person = new Person();
        person.firstName = "Nurik";
        person.lastName = "Zhek";
        person.age = 36;
        System.out.println(person.firstName + " " + person.lastName + " " + person.age);
        System.out.println("=================================");

        Person person2 = new Person("Samuel", 4);
        System.out.println(person2.firstName + " " + person2.age);
        System.out.println("++++++++++++++++++++++++");

        Person person3 = new Person("Allan", "Zhek", 11);
        System.out.println(person3.firstName + " " + person3.lastName + " " + person3.age);
        System.out.println("------------------------------------------");

        Person person4 = new Person("Danial", "Zhek", 12);
        person4.printFullName();
        System.out.println("__________________________");

       String res = person.getFullDetails();
        System.out.println(res);
        System.out.println("----------------------");

        person.increaseAge(2);
        person.increaseAge(5);

        res = person.getFullDetails();
        System.out.println(res);
    }
}