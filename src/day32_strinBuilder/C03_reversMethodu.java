package day32_strinBuilder;

public class C03_reversMethodu {
    public static void main(String[] args) {
        //verilen bir input u tersine çevirip bize donduren bir method olusturun

        String input="hey gidi for loop";

        String tersInput=tersineCevir(input);
        System.out.println("tersInput = " + tersInput);
        
    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();

    }
}
