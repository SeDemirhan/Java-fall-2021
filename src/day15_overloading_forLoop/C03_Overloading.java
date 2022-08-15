package day15_overloading_forLoop;

public class C03_Overloading {

    public static void main(String[] args) {
        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);

    }

    public static void topla(int sayi1 , int sayi2){
        System.out.println("iki integerin toplamı = "+(sayi1+sayi2));
    }
/*
    // bir class da parametre sayısı ve parametre data turleri aynı olan 2 method olusturamayız
    public static void topla(int sayi3 , int sayi4){
        System.out.println("iki integerin toplamı = "+(sayi3+sayi4));
    }

 */

    public static void topla(double sayi1 , int sayi2){
        System.out.println("bir double ve bir integerin toplamı = "+(sayi1+sayi2));
    }

    public static void topla(int sayi1 , double sayi2){
        System.out.println("bir integer ve bir doublenin toplamı = "+(sayi1+sayi2));
    }

    public static void topla(double sayi1 , double sayi2){
        System.out.println("iki doublenin toplamı = "+(sayi1+sayi2));
    }

}
