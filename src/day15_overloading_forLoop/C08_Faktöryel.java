package day15_overloading_forLoop;

public class C08_Faktöryel {
    public static void main(String[] args) {

        /*
input olarak verilen bir tamsayi icin faktoriyel hesaplayip yazdiran bir method olusturun

verilen sayi ,negatif veya 20'den buyuk olursa
"girilen sayinin faktoriyeli hesaplanamaz" uyarisi yazdirin
 */

        int input=7;
        faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktorlyel=1;

        if (input<0 || input>20){
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz");
        }else if(input==0){
            System.out.println("0!= 1 dir");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktorlyel*=i;

            }
            System.out.println(faktorlyel);
        }


    }
}
