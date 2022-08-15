package day32_strinBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman güzel");

        System.out.println(sb.delete(8,9));//Java herzaman güzel
        System.out.println(sb.deleteCharAt(8));//Java heraman güzel

        //bastan baslayarak her loop

        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            System.out.println(sb.deleteCharAt(0));


        }
    }
}
