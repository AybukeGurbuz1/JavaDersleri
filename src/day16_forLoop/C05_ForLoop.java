package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // soru 10) kullanicidan iki sayi isteyin
        //         -girilen sayilar ve aralarindaki tüm tam sayilari toplayip
        //         -sonucu yazdiran bir method yaziniz

        // kullanıcı dan istemeyi main method da iste, toplamayı diğer methodda

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin");
        int bas= scan.nextInt();
        int bitis= scan.nextInt();

        aralaritopla(bas,bitis);   // void oldugu icin birsey atamaya gerek yok
        


    }

    public static void aralaritopla(int bas, int bitis) {
        int toplam = 0;
        if(bas<=bitis){

            for (int i = bas; i <=bitis; i++) {
                toplam += i;
        }
        }else{

        for (int i=bitis; i <=bas ; i++) {
            toplam +=i;
        }
        }
        System.out.println("Aradaki sayilarin toplami :" +toplam );
}}
