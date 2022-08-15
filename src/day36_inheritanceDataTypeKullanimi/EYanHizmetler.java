package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("Yan hizmetler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void issizlikSigortasi(){
        System.out.println("Memurlar %30 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {


        BMuhasebe yh1=new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); // M
        System.out.println(yh1.saatUcreti); // M
        yh1.maas(); // YH(yan hizmetlerde de oldugu için(override edilmiş)
        yh1.ozelSigorta(); //M (YH de override edilmemiş)
        yh1.sigorta(); // P
        System.out.println(yh1.isim); //P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departmant);//P
        //System.out.println(yh1.issizlikSigorta);
        //aramaya muhasebeden basladıgımızdan
        //issizlikSigorta bulamadık
    }
}
