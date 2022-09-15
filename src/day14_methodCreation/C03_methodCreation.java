package day14_methodCreation;

public class C03_methodCreation {
    public static void main(String[] args) {

        // ınput olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak şekilde
        // I**** k***** seklinde yazdirin

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim);
        C02_methodCreation.rakamlariTopla(654);
    }

    public static void ismiGizle(String isim, String soyisim) {

       isim= isim.substring(0,1).toUpperCase()
               +isim.substring(1).replaceAll("\\w","*");
       soyisim=soyisim.substring(0,1).toUpperCase()
               +soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim +" "+ soyisim);
    }
}
