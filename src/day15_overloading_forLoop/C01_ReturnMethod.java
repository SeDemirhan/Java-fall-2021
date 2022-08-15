package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        // verilen iki sayıyı carpıp
        //sonucu bize donduren bir method olusturun

        int sayı1=10;
        int sayı2=5;

        int sonuc=carpGetir(sayı1,sayı2);
        System.out.println(sonuc);
    }

    public static int carpGetir(int sayı1, int sayı2) {

        return sayı1*sayı2;
    }
}
