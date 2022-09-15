package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // soru 2) kullanıcıdan bir harf isteyin
        // küçük harf ise konsola "Kucuk Harf"
        // büyük harf ise konsola "Buyuk Harf" yazdırın
        // yoksa "girdiğiniz karakter harf değil" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        //String sonuc =(harf>='a' && harf<='z') ? ("Kucuk Harf") :
               // ("Buyuk Harf veya gecersiz karakter")

        String sonuc =(harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ((harf>= 'A' && harf<= 'Z') ? "Buyuk Harf" : "gecersiz karakter");

        // parantez olmasa da çalışır

        String sonuc2 =harf>='a' && harf<='z' ? "Kucuk Harf" :
                       harf>= 'A' && harf<= 'Z' ? "Buyuk Harf" : "gecersiz karakter";
    }
}
