package day31_timeFormatter_varrargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen iki int i toplayip sonucu yazdiran method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;

        ToplaYazdir(sayi1, sayi2, sayi3, sayi4);
    }

    public static void ToplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Verilen dort sayinin toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));

    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen uc sayinin toplami : " + (sayi1 + sayi2 + sayi3));
    }
    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("Verilen iki sayinin toplami : " + (sayi1+sayi2));
    }
}


