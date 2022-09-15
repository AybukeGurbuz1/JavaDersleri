package day03_scanner;

import java.util.Scanner;

public class C08_Scannerilkharf {

    public static void main(String[] args) {
    //kullanıcıdan ismini alıp, ilk harfini büyük harf olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");

        // java scanner classında nextChar() method u yoktur
        // bunun yerine String olarak ilk kelimeyi alıp onunda ilk harfini alabiliriz

        char ilkHarf= scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi : " + ilkHarf);
    }
}
