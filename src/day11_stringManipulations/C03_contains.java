package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresi giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("lutfen email yaziniz");
        } else if (email.lastIndexOf("@mail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
