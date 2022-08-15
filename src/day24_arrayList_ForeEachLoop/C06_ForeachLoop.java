package day24_arrayList_ForeEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,6,23,6,8,9,1};

        List<Integer>liste=new ArrayList<>();

        //arraydeki tum elemanları inceleyim tek sayı olanları liste atayalım

        for (int each: arr   ) {  //gelecek dataların turu,loop içinde ne isim verdim ,nereden aldım


            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
