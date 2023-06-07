public class MiddleNumbers {
    public static void main(String[] args) {
        String str = "stranger";
        int middle = str.length() / 2;
        if (str.length() % 2 == 0) {
            System.out.println("The middle letter of the string " + str + " is " + str.charAt(middle-1) + " and " + str.charAt(middle));
        } else {
            System.out.println("The middle letter of the string " + str + " is " + str.charAt(middle));
        }
    }
}
