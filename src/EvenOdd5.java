import java.util.Random;

public class EvenOdd5 {
    public static void main(String[] args) {
            int num = new Random().nextInt(101);

            if (num % 2 == 0) {
                System.out.println("Yes, even: " + num);
            } else {
                System.out.println("No, odd: " + num);
            }
        }
    }


