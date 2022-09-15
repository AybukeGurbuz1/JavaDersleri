package day03_scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin...
        //girilen ismi
        //isminiz : Ismail şeklinde yazdırın

        //insanların dunyasindan kod'larimizin bulumdugu class'a deger almak için
        //Scanner classını kullanırız

        //1- Scanner objesi oluşturalım
        Scanner scan =new Scanner(System.in );

        //2- Kullanıciya ne istediğimizi söyleyelim
        System.out.println("lütfen isminizi giriniz");

        //3- Oluşturduğumuz scan objesi ilekullanıcının girdiği değeri alıp
        //   oluşturacağımız uygun bir variable' a atayalım
        String kullanıcıIsmi= scan.next();

        System.out.println("Isminiz: " +kullanıcıIsmi);
    }

}
