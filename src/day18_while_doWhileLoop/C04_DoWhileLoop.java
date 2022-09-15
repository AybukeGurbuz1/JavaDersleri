package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
         /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // while loop ile yapalım
         /*
            Loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz
            while loop'da, loop'dan once olusturdugumuz bu variable'a
            atayacagimiz degeri iyi dusunmemiz gerekiyor
         */

        while (sayi % 2 == 0) {

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift : " + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }
        }
        // do while loop ile yapalim;
        // do while'loop'da onceden olusturulan variable'a hangi deger atandiginin
        // hic bir onemi yok, kodumuz her durumda calisir
        /*
          do-while'in dezavantaji :
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */
        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift : " + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar");

            }

        } while (sayi % 2 == 0);
    }
}