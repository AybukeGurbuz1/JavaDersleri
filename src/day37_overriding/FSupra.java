package day37_overriding;

public class FSupra extends EToyota {


    void yakit() {
        System.out.println("Supra benzin kullanir");
        /*

         Private method'lar override edilemez
          Eger Child class'da parent class'daki private method ile
          ayni signature'da bir method olusturursaniz
          bu overridding method OLMAZ

         */
    }

    @Override
    void motor() {
       /*
        @Override notasyonu javaya bir görev verir
        java bu notasyonla birbirine baglı olan iki methodu
        surekli kontrol eder
        eger parent class daki overridden methodunu silerseniz
        CTE verir

        @override notasyonu kullanmak mecburi degildir
        Eger overriding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
        */
    }
}

