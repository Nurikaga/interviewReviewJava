import java.util.LinkedHashMap;
import java.util.Map;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        System.out.println(largest(4, 5, 6));
    }
    public static int largest(int num1, int num2, int num3){
        int largest = num1;
        if(num2 > largest){
            return largest = num2;
        }else if(num3 > largest){
            return largest = num3;
        }
        return largest;
    }
}
