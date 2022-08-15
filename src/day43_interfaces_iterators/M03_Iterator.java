package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        for (Integer each:liste
             ) {
            each+=3;
            System.out.print(each + " ");

        }
        System.out.println("");
        System.out.println(liste);


        Iterator it1= liste.iterator();
    }
}
