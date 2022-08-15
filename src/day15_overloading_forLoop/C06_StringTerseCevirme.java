package day15_overloading_forLoop;

import static day14_methodCreation.C01_MethodCreiation.terstenYazdır;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen string i terse cevirip yazdıran bir method olusturun

        String input="Java gün gectikce güzellesiyor";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i = 0; i <input.length()-1 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }
}
