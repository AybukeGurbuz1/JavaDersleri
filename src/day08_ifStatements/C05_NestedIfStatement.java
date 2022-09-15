package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfStatement {
    public static void main(String[] args) {
    // soru 11
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre=scan.next();

        char ilkHarf= sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z') { //ilk harfi buyuk olan kelimeler

            if(ilkHarf== 'A'){

                System.out.println("Gecerli sifre.");

            } else {

                System.out.println("Gecersiz sifre.");

            }

        } else if (ilkHarf>='a' && ilkHarf<='z'){

            if(ilkHarf=='z') {

                System.out.println("Gecerli sifre.");

            } else {

                System.out.println("Gecersiz sifre.");

            }

        } else {

            System.out.println("Lutfen ilk karakter icin sadece harf kullanin.");


        }
}}