package day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        soru 4) kullanicidan baslangiv ve bitis harflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        kullanicinin hata yapmadigini farz edin
         */

        char ilkHarf = 'f';
        char sonHarf = 't';

        char temp = ilkHarf;

        String buyult = "";

        while (temp <= sonHarf) {

            buyult = (temp + "").toUpperCase();

            System.out.print(buyult + " ");
            temp += 1;

        }
    }
}
