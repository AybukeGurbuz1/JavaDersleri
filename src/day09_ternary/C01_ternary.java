package day09_ternary;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {

        // 1) kullanıcıdan bir sayı alın ve mutlak değerini yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1 * sayi));
    }
}
