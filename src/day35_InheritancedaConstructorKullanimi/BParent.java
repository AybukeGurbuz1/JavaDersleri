package day35_InheritancedaConstructorKullanimi;

public class BParent extends AGrandParent {

    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent Klubu";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
