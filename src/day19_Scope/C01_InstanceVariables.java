package day19_Scope;

public class C01_InstanceVariables {
    /*
    class iceriainde heryerden kullanmak istedigimiz variable ları
    class level da (class ın icinde ama method ların dısında)
    genellikle class level variable lar class ın basinda olusturulur(sart degil)

    class level daki variable lar icin 2 scope vardır
    1- static variables (class variable ları da denir)
    2- instance (static olmayan) variables (obje variable ı da denir)

     */

    int instSayi=20; // static olmayip class level da oldugu icin instance variable dır

    public static void main(String[] args) {
        int sayi=10;
        /* System.out.println(instSayi);
           instance variables static olmadigi icin static klup e uye main method dan direk kullanamayiz
           instance variable ların diger adı object variable dır
           dolasıyla obje oluşturursanız instance variable ları heryerden kullanabilirsiniz
         */
        C01_InstanceVariables obje1= new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : " + obje1.instSayi);  // 20
        obje1.instSayi=30;
        System.out.println("obje1 degistıkten sonra : " + obje1.instSayi);   //30

        C01_InstanceVariables obje2= new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : " + obje2.instSayi);  // 20
        obje2.instSayi=25;
        System.out.println("obje2 degistıkten sonra : " + obje2.instSayi);   //25

        C01_InstanceVariables obje3= new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : " + obje2.instSayi);  // 20


        /*
        her obje olustugunda instance (obje) variable ının ilk atama degerini alır
         */

    }


    public static void staticMethod(){
       // System.out.println(sayi);
        /*
        bir method un icerisinde olusturulan variable,
        sadece o method un icinden kullanılabilir
        (local variables)
         */
        /*
         instSayi=30;
         instance variable lara main method dısında ki
         */

    }


    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
         instance variable'lar class icerisindeki
         static olmayan method'lardan direk kullanilabilir
         */
    }
}
