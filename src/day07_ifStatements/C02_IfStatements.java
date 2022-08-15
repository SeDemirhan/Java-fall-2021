package day07_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int sayi=10;

        if (sayi>0){
            System.out.println("sayı pozitif");
        }

        if (sayi%2==0){
            System.out.println("sayı cift");
        }
        if (sayi%5==0){
            System.out.println("sayı 5 in katı");
        }

        /*
        basit if cümleleri kodun diğer parcalarında bağımsızdır
        sadece bir sart kontrol eder, sart sağlanıyorsa, if bady çalısır yoksa calısmaz
        birden fazla basit if cümlesi varsa girilen sarta bağlı olarak tüm if bady si calısabilir
        veya hiçbir if bady si calısmayabilir
         */
    }
}
