package day07_IfStatement;

import java.util.Scanner;

public class C08_Odev1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kısa kenarını giriniz");
        double a = scan.nextDouble();

        System.out.println("lütfen dikdörtgenin uzun kenarını giriniz");
        double b= scan.nextDouble();

        if (a>b || b>a) {
            System.out.println("dikdörtgendir");
        } else {
            System.out.println("karedir");
        }

    }
}
