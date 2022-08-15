package day14_methodCreation;

import day13_MethodCreation.C01_MethodCreation;

public class C02_MethotCreation {
    public static void main(String[] args) {

        // Verilen 3 basamaklı bir sayının
        // rakamlarını yazdıran bir method olusturun

        int input=423;

        rakamlariTopla(input);
        C01_MethodCreation.topla(6,3);
        C01_MethodCreiation.terstenYazdır("seli");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagı=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        System.out.println("rakamlarToplami = " + rakamlarToplami);
    }
}
