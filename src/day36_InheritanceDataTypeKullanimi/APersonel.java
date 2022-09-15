package day36_InheritanceDataTypeKullanimi;

public class APersonel {

    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departmant="departmant belirtilmedi";

    protected void maas(){
        System.out.println("tum personelimiz maas alir");
    }
    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }
}
