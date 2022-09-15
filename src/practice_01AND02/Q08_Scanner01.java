package practice_01AND02;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanıcıdan iki tam sayi alin --> scan objesi al sout bilgisi geç s1 s2
    // bu tam sayilari toplayin ve sonucunu yazdirin



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("iki sayinin toplami : " + (sayi1 + sayi2));

}}
