package day35_inheritancedeContructorKullanimi;

public class HCorolla extends GToyata{
    HCorolla (){

        System.out.println("HToyoya parametresiz cons.");
    }
    HCorolla (String isim){
        super(isim);

        System.out.println("HToyoya parametreli cons.");
    }
}
