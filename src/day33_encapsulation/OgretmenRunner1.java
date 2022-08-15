package day33_encapsulation;

public class OgretmenRunner1 {
    public static void main(String[] args) {

        Ogretmen1 ogr1=new Ogretmen1();

        ogr1.setIsim("Serdar");
        System.out.println(ogr1.getIsim());

        /*
        bu yontemde data hiding degil daha
        anlasılır kod amaclanmıstır
         */
    }
}
