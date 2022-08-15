package day21_arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
/*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
         */

        String[] harfler={"Y","B","D","G","O"};
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));;

       //binarySearch bize aradığımız elemanın indeksini döndürür.
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz
    }
}
