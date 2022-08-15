package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);

        // arraye eleman eklek istersek

        isimler.add("Serdar");
        System.out.println(isimler.add("Selim")); // true doner


          /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         */
        System.out.println(isimler);//[Serdar, Selim]

          /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */



    }
}
