public class MissingNumber {
    public static void main(String[] args) {
int[] b = {1, 2, 3, 4, 5, 6, 8, 9};
int sum = 0;
for(int i = 0; i < b.length; i++){
    sum = sum + b[i];
}
        System.out.println(sum);

    int sum1 = 0;
    for(int j = 0; j <= 9; j++){
        sum1 = sum1 + j;
    }
        System.out.println(sum1);
        System.out.println("the missing number is : " + (sum1 - sum));
}}
