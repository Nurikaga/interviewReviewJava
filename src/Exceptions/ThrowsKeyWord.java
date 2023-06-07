package Exceptions;

public class ThrowsKeyWord {
    public static void main(String[] args){
        ThrowsKeyWord obj = new ThrowsKeyWord();
        obj.sum();

    }
    public void sum(){
        try{
            div();
        }catch(ArithmeticException e){

        }
    }
        public void div() throws ArithmeticException{
            int i = 9/0; // exception line

        }    }

