package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    // emeklilik kontrolü yapan bir program yaziniz
    // cinsiyet olarak E (erkek) veya K (kadin) değişkenlerini kabul etsin
    // farkli bir harf veya sembol girilirse hata mesaji versin

    // emeklilik için kadinlarda yas siniri 60
    // erkeklerde 65 olsun

    // negatif yas veya 80 den buyuk yas girilirse hata mesaji versin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yaziniz" +
                "\n Kadin için K Erkek için E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        double yas = scan.nextDouble();


    }
}
