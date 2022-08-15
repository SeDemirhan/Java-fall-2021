package day21_arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int[] sayilar={5,7,1,6,4,3,9};

        //Aray i Arrays class'ını kullanarak sıralı hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }
}
