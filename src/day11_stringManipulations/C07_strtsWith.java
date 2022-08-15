package day11_stringManipulations;

public class C07_strtsWith {
    public static void main(String[] args) {

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J"));//TRUE
        System.out.println(input.startsWith(""));//true
        System.out.println(input.startsWith("gun",5));//true
    }
}
