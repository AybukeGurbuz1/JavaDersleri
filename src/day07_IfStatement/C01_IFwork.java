package day07_IfStatement;

import java.util.Scanner;

public class C01_IFwork {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");

        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("bu sayi çift tamsayidir");
        }
        else {
            System.out.println("bu sayi tek tamsayidir");
        }
}}