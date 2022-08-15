package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar(5 dahil) olan sayıları toplayalım
        int toplam=0;


        for (int i = 1; i <=5 ; i++) {

            toplam+=i;


        }
        System.out.println(toplam);

        // 10 ile 20 arasındaki sayıların toplamı
        toplam=0;

        for (int i = 10; i <21 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

        // 30 ile 50 arasındaki çift sayıların toplamı

        toplam=0;
        for (int i = 30; i <51 ; i+=2) {
            toplam+=i;

        }
        System.out.println(toplam);

        toplam=0;
        for (int i = 30; i <51 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
       }
        System.out.println(toplam);

        // 1500 ile 1600 arasında 7 ile bölünebilen sayıların toplamı

        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }

        }
        System.out.println(toplam);
    }
}
