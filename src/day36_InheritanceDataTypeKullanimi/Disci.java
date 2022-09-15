package day36_InheritanceDataTypeKullanimi;

import java.util.*;

public class Disci extends BMuhasebe {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + "maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new Disci();
        /*
        Bir obje olusturulurken
        data turu ve cons ayni class dan ise
        direk o class a gidiyorduk

        eğer data turu ve cons farkli ise
        obje constructor ın oldugu class in objesidir.
        ancak , bizden istenen
        Isci class in da ki spesifik özellikler degil
        Bir iscinin muhasebe class ındaki
        tum calisanlarla beraber  sahip oldugu
        genel özellikleri yazdirir

         */
        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minumum : 2400 maas alir
        isc1.ozelSigorta(); // M ısteyen calisanlara % 50 indirimli ozelsig yapilir
        isc1.sigorta(); // Personelden -parent Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim); // p
        System.out.println(isc1.soyisim); // p
        System.out.println(isc1.departmant);// p

        APersonel isc2 = new Disci();
        // System.out.println(isc2.gunlukMesai); // M 8
        //  System.out.println(isc2.saatUcreti); // M 10
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilirkh
        isc2.maas(); //  Personel minumum : 2400 maas alir
        isc2.sigorta(); // Personelden -parent
        System.out.println(isc2.isim); // p
        System.out.println(isc2.soyisim); // p
        System.out.println(isc2.departmant);// p

        /*
        eger data turu olan class da aradigimiz ozellik yoksa
        varsa onun parent ina gidebilir
        ama child a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */

    }
}
