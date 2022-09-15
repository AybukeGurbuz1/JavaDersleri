package day10_StringManipulation;

import java.util.Scanner;

public class C08_indexOfSoru2 {
    public static void main(String[] args) {

        // kullanıcıdan bir cümle ve bir kelime isteyin, kelimenin cümlede ki kullanımına bakarak
        // aşağıdaki 3 cümleden uygun olanı yazdırın
        //girilen kelime cümle de kullanılmamış
        // girilen kelime cümle de bir kere kullanılmış
        // girilen kelime cümle de birden fazla kullanılmış


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scan.next();

        if (cumle.indexOf(kelime) == -1) {
            System.out.println("Girilen kelime cümlede kullanılmamis");

        } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
            System.out.println("Girilen kelime cümlede 1 kere kullanılmıs");

        }  else {
            System.out.println("Girilen kelime cümlede 1 den fazla kullanılmıs");

        }
    }
}
