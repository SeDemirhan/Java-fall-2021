package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        //verilen bir arraydeki terar eden elementleri
        //silip tekrarsız halini array a atayan kod yazın.

        int arr[]={4,5,3,6,8,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsızSet=new HashSet<>();

        for (int each : arr
             ) {
            tekrarsızSet.add(each);

        }
        System.out.println("set : "+tekrarsızSet);

        int tekrarsızArr[]=new int[tekrarsızSet.size()];

        int i =0;

        for (Integer each:tekrarsızSet
             ) {
            tekrarsızArr[i]=each;
            i++;
        }

        arr=tekrarsızArr;
        System.out.println("Arrayin son hali : "+ Arrays.toString(tekrarsızArr));




    }
}
