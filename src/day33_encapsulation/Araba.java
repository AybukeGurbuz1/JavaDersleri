package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";  // marka nin access modifier ı default access modifier
                                        // oldugundan, package icerisinde kullanılabilir
    private String model="Model belirtilmedi" ;
    private String yakit="Elektrikli" ;   // tum arabalar elektrikli ise  bu variable ın degistirilmemesi lazim
       // private yaptıgımız model ve yakıt variable larına erişimi yetkilendirelim
       // model'e deger atanabilsin ama gorulemesin(setter)
       // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}

