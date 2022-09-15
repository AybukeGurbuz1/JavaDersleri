package day19_Scope;

public class C02_StaticVariables {

   static int staticSayi=10;
   String isim="Mehmet";

   static int degersizStaticVar;
   int degersizInstanceVariable;
   /*

    */

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir
         */
        System.out.println(staticSayi);  //  10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);  // 12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); // 20
        /*
        instance bir variable ın degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip edip
        static variable ın son degerini
        bulmamiz gerekir
         */
    }

    public static void staticMethod(){
        System.out.println(staticSayi);  // 10


    }

    public void staticOlmayanMethod(){
        /*
        static variable lar class icerisinden her yerden ulasılabilir
        static olsun veya olmasin static variable ları gorebilir ve degistirebilir
        farklı method larda static variable ın hangi degeri alacagını bilmek istiyorsak
        classın basından itibaren kodun calısmasını takip etmeliyiz
        method ne zaman cagrilirsa
         */
        System.out.println(staticSayi);  // 12
        staticSayi=20;
    }
}
