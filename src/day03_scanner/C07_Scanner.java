package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
       //bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi soyisminizi ve yaşınızı giriniz \naralarda Enter tuşuna basınız");

        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();
        int yas = scan.nextInt();


        //girilen bilgiler = seyfi çapar 34 şeklinde yazdırın
        System.out.println("girilen bilgiler = "+isim+", "+soyIsim+", "+yas);



    }
}
