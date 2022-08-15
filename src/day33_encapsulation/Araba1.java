package day33_encapsulation;

public class Araba1 {

            String marka="Marka belirtilmedi";//marka nın access modifier i defoult olduğundan
                                              // package içinden görülebilir
    private String model="Model belirtilmedi";
    //private yaptıgımız model ve yakıt variable larımıza erişimi yetkilendirelim
    // model e deger atanabilsin ama görülmesin(setter)
    //yakıt ise görülebilsin ama yeni deger atanamasın isteniyor(getter)
    private String yakit="Elektrikli";//tum arabalar elektrikli ise
                                     // bu variablenin degismemesi lazım


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
