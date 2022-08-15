package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayılar[]={1,2,3,4,5,6,7};
        // array in tamamını yazdıralım

        System.out.println(Arrays.toString(sayılar));//[1, 2, 3, 4, 5, 6, 7]

        // arrayin tum elementlerini yazdıralım

        for (int i = 0; i < sayılar.length ; i++) {
            System.out.print(sayılar[i]+" ");

        }
    }
}
