package day20_Arrays;

public class C01_LocalVariables {

    public static void main(String[] args) {

        int sayı=10;

      //  System.out.println(sayıMethod); sayıMethod method1 de olusturulmus local variabledir

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);

        }

       // System.out.println(i); // loop da olusturulmus variabledir.
        // sadece loop içerisinde kullanılır

      //  static int sayıStatic=20; static keyword sadece class level da kullanılır
        // methodların içerisinde static variable tanımlanamaz

    }


    public static void method1(){

       // System.out.println(sayı); sayı main method da olusturulmuş
        //local bir variabledir. ve sadece main methodda gecerlidir

        int sayıMethod=20;

    }
}
