package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);//[5, 3, 2, 1]

        sayilar1.remove(1);

        /*
        sayılardan olusan bir list varsa java remove methodunda
        sayı yazdığımızda direkt index olarak kabul eder
         */
        System.out.println(sayilar1);//[5, 2, 1]

        //illa 5 i silsin dersek
        // silinecek objeyi bir variableye tanımlayabiliriz
        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);//[2, 1]

        //ya da
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);//1






    }
}
