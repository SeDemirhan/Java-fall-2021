package odevler;

import java.util.Scanner;

public class day12_S5 {
    public static void main(String[] args) {
        //Soru 5 Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort harfli bir giriniz");
        String kelime= scan.next();

        String tersKelime=kelime.substring(3)+
                          kelime.substring(2,3)+
                          kelime.substring(1,2)+
                          kelime.substring(0,1);
        System.out.println(tersKelime);


    }
}
