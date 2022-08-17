package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
        /*
1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
3) Functional Programming, Arrays ve Collections ile kullanılır.
4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

 */
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirStructured(liste);
        System.out.println("");
        listElemanlariniYazdirFunctional(liste);
        System.out.println("");
        ciftElemanlariYzdirStructured(liste);
        System.out.println("");
        ciftElemanlariYzdirFunctional(liste);
        System.out.println("");
        tekElemanlarinKareleriniYzazdir(liste);
        System.out.println("");
        tekrarsizTekElemanlarinKüpünüYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);

        //1) Ardışık list elementlerini aynı satırda aralarında
        // boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    }
    public static void listElemanlariniYazdirStructured(List<Integer> list){

        for (Integer w:list
             ) {
            System.out.print(w+" ");

        }

    }

    //1)Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+" "));

    }
    //2)çift list elementlerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYzdirStructured(List<Integer>list){

        for (Integer w :list) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYzdirFunctional(List<Integer>list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
//3) Ardışık tek list elementlerinin karelerini aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYzazdir(List<Integer>list){
        list.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
    // elemanların degerleri degisecekse map methodu kullanılır.

    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    //aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKüpünüYazdir(List<Integer>list){
        list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

    }

//5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);

    }


}
