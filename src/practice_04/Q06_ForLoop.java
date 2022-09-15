package practice_04;

import java.util.Scanner;

public class Q06_ForLoop {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
    /*
    for (int i = 1; i<=10; i++) {  //outer for
        for (int j = 1;
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz");

        int n= scan.nextInt();

        System.out.println("Girilen sayi kaça kadar çarpilsin");

        int y= scan.nextInt();

        for (int i = 1; i <= y ; i++) {  //Girilen y değişkeninden i'ye kadar olan sayıların yazılmasını sağlıyoruz.
            System.out.println(n+" * "+i+" = "+n*i); // Tablonun ekran ciktisi.
        }

    }
}
