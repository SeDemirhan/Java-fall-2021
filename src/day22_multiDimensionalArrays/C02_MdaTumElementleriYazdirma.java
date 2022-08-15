package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // Verilen bir multi dimensional arrayin
        // tum elementlerini yazdıran bir method olusturun

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdır(sayilar);
    }

    public static void elementleriYazdır(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {
           // for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(Arrays.toString(sayilar[i])); //array olarak yazdırdı

            }
        System.out.println("");
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(sayilar[i][j]+" ");//element olarak yazdırdık

            }
        }

        }
    }

