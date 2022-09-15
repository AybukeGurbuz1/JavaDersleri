package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void IssizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class taki bir method un
        parent class taki ayni isimdeki mrthodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya çıkarmasidri

        overridingi nerede dikkate alıyoruz?
        bir obje olusturulurken data turu ve const farkli ise

        eger bir obje olusturulurken data turu ve
        const farkli ise objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- obje constraktor ın oldugu class da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class dan baslariz
           bu class da aranan ozellik bulunamazsa parent class lara bakilir
           ordada bulamazsak CTE  verir

           eger aranan özellil variable ise buldugumuz ilk degeri yazdiririz
         3- aranan ozellik method ise
         degeri yazdirmadan once
         overrideedilmis mi diye kontrol etmemiz gerekir
         eger override edildiyse en gumcel degeri yazdiririz

         */

        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH  Yan Hizmetliler : 2160 maas alir
        yh1.ozelSigorta(); // M
        yh1.sigorta(); // Personelden -parent
        System.out.println(yh1.isim); // p
        System.out.println(yh1.soyisim); // p
        System.out.println(yh1.departmant);// p
        // System.out.println(yh1.issizlikSigorta)
        // Aramaya muhasebeden basladigimizdan
        // IssizlikSigortasi bulamadik CTE

}}


