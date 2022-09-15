package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Soru 4) Kullanıcıdan bir sayı alın. Sayı pozitifse "sayı pozitif" yazdırın,
        //         negatifse sayinin karesini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        // Eğer ternary içindeki sonuçlar farklı atama türlerinde ise
        // atama yapamayız, sadece yazdırabiliriz
       // double sonuc = sayi>0 ? "sayi pozitif" : (sayi*sayi);

        System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));
    }
}
