package Exceptions;

public class ExceptionHandling {
  // int a  = 10;
//    static ExceptionHandling obj;
    public static void main(String[] args) {
//        uncaught exception
//        int i = 9/0;
//        System.out.println(i);

        //caught exception
//        Thread.sleep(200);


       // System.out.println(obj.a);
 try {
     int i = 9 / 0;
 }
catch(Exception e){ // this code will throw an exception
    e.printStackTrace();
   System.out.println(e.getMessage());
}
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
    }
}
