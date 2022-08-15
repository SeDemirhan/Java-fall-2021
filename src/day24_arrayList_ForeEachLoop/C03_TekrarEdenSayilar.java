package day24_arrayList_ForeEachLoop;

import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden elementleri yazdırın

        int[]arr={2,3,5,6,3,5,4,1,9,6,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < args.length-1 ; i++) {
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i]+" ");

            }

        }

    }
}
