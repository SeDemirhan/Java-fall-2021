package day14_methodCreation;

public class C01_MethodCreiation {
    public static void main(String[] args) {

        // Input olarak verilen 4 harfli bir string i
        // tersten yazdıran bir method olusturalım
       terstenYazdır("seda");
        
        
        
    }

    public static void terstenYazdır(String input) {
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println("tersInput = " + tersInput);
    }


}
