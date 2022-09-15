package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini soyismini ve yaşını alıp
        // girilen bilgiler = seyfi çapar  34  şeklinde yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        //String verileri scanner ile alırken
        // next() : ilk boşluğa kadar olan kısmı (1 kelime) alır
        // nextline() : satırın sonuna kadar ne yazarsak alır
        //NOT : eğer ardarda birden fazla String değer alacaksak nextLine() kullanmalıyız

        String isim= scan.nextLine();

        System.out.println("lütfen soyIsminizi giriniz");

        String soyIsim= scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");


        double yas= scan.nextDouble();
        //girilen bilgiler = seyfi çapar 34 şeklinde yazdırın
        System.out.println("girilen bilgiler = "+isim+" "+soyIsim+" "+yas);


    }
}
