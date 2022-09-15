package day31_timeFormatter_varrargs;

import static day31_timeFormatter_varrargs.C02_Varargs.ToplaYazdir;

public class C03_VarragsIleToplama {
    public static void main(String[] args) {
        // verilen kav integer olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        ToplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        ToplaYazdir(sayi1, sayi2, sayi3, sayi4);
        ToplaYazdir(sayi1, sayi2, sayi3);
        ToplaYazdir(sayi1, sayi2);
    }

    private static void ToplaYazdir(int... sayi) {
        /*
        int... sayi bu gösterim integer variable lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir

         */
        int toplam = 0;
        int sayiAdedi= sayi.length;
        for (int each : sayi
        ) {
            toplam += each;
        }
        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami : " + toplam);
    }


}

