public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(maxNumber(new int[] {4, 7, 8, 9, 6}));
        System.out.println(maxNumber2(new int[] {4, 7, 8, 9, 5, 10}));
    }
    public static int maxNumber(int[] arr){
        int max = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int maxNumber2(int[] arr){
        int max = arr[0];
        for(int el : arr){
            if(max < el){
                max = el;
            }
        }
        return max;
    }
}
