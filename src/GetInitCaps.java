public class GetInitCaps {
    public static void main(String[] args) {
        System.out.println(meth("hello world yeah"));
        System.out.println(meth2("hello world yeah"));
    }
    public static String meth(String str){
        StringBuilder res = new StringBuilder();
        String[] letters = str.split(" ");
        for(int i = 0; i < letters.length; i++){
            res.append(letters[i].charAt(0) + " ");
        }
        return res.toString().toUpperCase();
    }
    public static String meth2(String str){
        String space = " ";
        String[] letters = str.split(" ");
        for(int i = 0; i < letters.length; i++){
            space += letters[i].substring(0, 1) + " ";

        }
        return space.toUpperCase();
    }
}








