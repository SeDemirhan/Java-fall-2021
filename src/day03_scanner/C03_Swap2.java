package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir omceki swap sorusunu bos kova kullanmadan yapın

        int sayı1=10;
        int sayı2=20;

        sayı1=sayı2+sayı1;
        sayı2=sayı1-sayı2;
        sayı1=sayı1-sayı2;

        System.out.println(sayı1);
        System.out.println(sayı2);
    }
}
