package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan önce calisir
        (main method dan bile once )

        static block class olusturulduunda calisir
        genellikle de class lar ile ilgili ön ayarlamalar
        veya static variable lara degr atamak icin kullanılır

        static blokların class icerisinde nerede oldugu önemli degildir
        omce static bloklar calısır

        birden fazla static blok varsa yukarıdan asgı dogru calısır
         */
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altındaki static method calisti");
    }
}
