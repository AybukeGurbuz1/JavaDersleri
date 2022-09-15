package mentoring;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
        sayinin karekökünü hesaplama,
        sayinin üssünü hesaplama,
        sayinin karesini alma programini yapiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayinin karekökünü hesaplamak icin 1");
        System.out.println("Sayinin üssünü hesaplamak icin 2");
        System.out.println("Sayinin karesini almak icin 3'e basiniz ");

        int n, z;
        System.out.println("");

        int y = scan.nextInt();

        switch (y) {
            case 1:
                System.out.println("Karekökünü almak istediginiz sayiyi yazin");
                n = scan.nextInt();
                System.out.println("Sayinin karekökü = " + Math.sqrt(n));
                // sayinin karekökünü almak icin Math.sqrt() sinifini kullandim
                break;
            case 2:
                System.out.println("Ussunu almak istediginiz sayiyi girin");
                n = scan.nextInt();
                System.out.println("Sayi ussunu girin");
                z = scan.nextInt();
                System.out.println("Girilen sayinin " + (z) + " ussu " + Math.pow(n, z));
                // sayinin ussunu hesaplamak icin Math.pow() sinifini kullandim
                break;
            case 3:
                System.out.println("Karesini almak istediginiz sayiyi girin");
                n = scan.nextInt();
                System.out.println("Sayinin karesi = " + (n * n));
                break;
            default:
                System.out.println("Gecersiz bir deger girdiniz");
        }

    }

}
