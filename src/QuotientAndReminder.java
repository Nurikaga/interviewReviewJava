import org.w3c.dom.ls.LSOutput;

public class QuotientAndReminder {
    public static void main(String[] args) {


        int dividend = 50;
        int divisor = 6;

        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println(quotient);
        System.out.println(reminder);
    }
}