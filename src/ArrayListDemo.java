import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println(countLetters("okermvrokvmrlkcrsv"));

        }
        public static Map<Character, Integer> countLetters(String str){
        Map<Character, Integer> map =  new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch, value + 1);
            }else{
                map.put(ch, 1);
            }
        }
        return map;
        }
    }