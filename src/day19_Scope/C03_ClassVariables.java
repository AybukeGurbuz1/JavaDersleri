package day19_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
       /*
         farkli bir class da calisirken
         herhangi bir class adini yazip .'ya basarsak
         adını yazdıgımız class da ki tum STATİC class uyelerini gorebilir
         ve kullanabiliriz
      */
        C02_StaticVariables.staticMethod();  //
        System.out.println(C02_StaticVariables.staticSayi);
        System.out.println(C02_StaticVariables.degersizStaticVar);

        /*
        class level variable lara deger atayıp atamamak bize kalmıstır
        istersek deger atamasi yapariz, istemezsek deger atamayız
        eger deger atamamissak java atadıgımız o degeri kabul eder
        deger atamazsak java bu variable lara  default bir variable ataması yapar
        int--> 0
        String--> null
        boolean--> false
        char--> '' (hiclik)
         */

        /*
        baska class daki instance variable lar daki instance variable lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();  //10
        // bu method icinde staticSayi =20 oldu
        System.out.println(obje1.isim);  // mehmet
        System.out.println(obje1.degersizInstanceVariable);  // 0


        System.out.println(C02_StaticVariables.staticSayi);  // 20

        /*
        farklı bir class dan C02 clasndan method ve variable ları kullanıldıgında
        C02 class inin
         */
    }
}
