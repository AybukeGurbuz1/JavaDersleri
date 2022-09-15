package day07_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C08_OdevGun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gün ismini yazın");

        String girilenGun= scan.next().toLowerCase(Locale.ROOT);

        if (girilenGun.equals("pazar")) {

            System.out.println("hristiyanlar icin kutsal gun");
        } else if (girilenGun.equals("cuma")) {

            System.out.println("muslumanlar icin kutsal gun");

        } else if (girilenGun.equals("cumartesi")) {

            System.out.println("yohidi icin kutsal gun");
        } else {
            System.out.println("kutsal gun degildir.");
        }

    }
}
