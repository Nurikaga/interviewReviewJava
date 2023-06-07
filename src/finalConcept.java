public class finalConcept {
    public static void main(String[] args) {
       final int i = 10; // constant values (I can not change the value of i)
finalConcept f = new finalConcept();
        f.read();
        finalConcept f2 = new finalConcept2();
        f2.read();
    }
    public void read(){
        System.out.println("parent class -- is reading");
    }
}
