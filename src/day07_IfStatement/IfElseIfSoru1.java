package day07_IfStatement;

import java.util.Scanner;

public class IfElseIfSoru1 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar1==kenar2){
            System.out.println("Kenar uzunluklari girilen dikdörtgen ayni zamanda karedir");
        }else {
            System.out.println("Kenar uzunluklari girilen dikdörtgen kare degildir");
        }
    }
}
