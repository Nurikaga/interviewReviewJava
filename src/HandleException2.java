public class HandleException2 {
    public static void main(String[] args) {
        e();
        division();
    }

    public static void e() {
        try {
            int i = 10 / 0;
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("hey -- this / by 0 error");
        }
        System.out.println("ABC");

    }
public static void division(){
int i  = 10;
try{
    System.out.println("inside try block");
    int k = i/0;
}catch(NullPointerException e){
    System.out.println("Inside catch block");
    System.out.println("divide by zero error");
}finally{
    System.out.println("execute this code even after any exception");
}
}
}
