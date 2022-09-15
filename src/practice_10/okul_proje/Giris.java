package practice_10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        /*
        ogretmen bilgilerini kullanıcıdan aliniz
        aldiginiz bilgilerden object ureterek yeni
        ogretmenler olusturun ve bilgilerini yazdirin
         */

        System.out.println("hosgeldiniz okulumuza");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in); //TODO static tanimlama
        String isim= scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim= scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans= scan.nextLine();

        System.out.println("telefon no giriniz");
        String tel= scan.nextLine();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);
        




    }


}
