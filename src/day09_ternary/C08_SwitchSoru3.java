package day09_ternary;

import java.util.Scanner;

public class C08_SwitchSoru3 {
    public static void main(String[] args) {
        // kullanıcıdan bir tam sayı girmesini isteyin. girilen sayı
        // 10 ise "iki basamaklı en küçük sayı"
        // 100 ise "üç basamaklı en küçük sayı"
        //1000 ise "dort basamaklı en küçük sayı" yazdırın
        // diğer durumlarda "girdiğin sayıyı değiştir " yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        switch (sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("üç basamaklı en küçük sayı");
                break;
            case 1000:
                System.out.println("dört basamaklı en küçük sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir");

        }
    }
}
