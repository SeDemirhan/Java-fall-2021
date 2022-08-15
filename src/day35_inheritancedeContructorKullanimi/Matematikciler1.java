package day35_inheritancedeContructorKullanimi;

public class Matematikciler1 extends LOgretmen{

    Matematikciler1(){
        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler1(String isim){
        this();
        System.out.println("Matematik parametreli cons");
    }
    public static void main(String[] args) {
        Matematikciler1 obj1=new Matematikciler1("Tugba");
    }

}
