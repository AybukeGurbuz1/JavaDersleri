package day10_StringManipulation;

import java.util.Scanner;

public class C07_indexOfSoru1 {
    public static void main(String[] args) {
        //kullanıcıdan bir cümle ve bir harf isteyin, var olup olmadığını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        System.out.println(harf);

         if (cumle.indexOf(harf)==-1); {
            System.out.println("harf cümlenin içinde yok");
        }{
            System.out.println("harf cümlenin içinde var");
        }


    }
}
