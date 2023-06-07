public class CountUpLowerLetters {
    public static void main(String[] args) {

        String str = "Welcome to Automation";
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z')
                lower++;
        }
        System.out.println("Upper case letters : " + upper);
        System.out.println("Lower case letters : " + lower);


    }
}