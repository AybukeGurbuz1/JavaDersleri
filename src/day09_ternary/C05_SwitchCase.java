package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // kullanıcıdan gun numarasını alıp 1 ise pazartesi
        // 7 ise pazar yazdıralım

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kaçıncı gün olduğunu giriniz");
        int gunNo = scan.nextInt();

        // switch yanına yazılan () neye göre case atayacağımızı gösterir
        // java girilen değere göre case i bulur ve o satırdan çalıştırmaya başlar
        // break yazısı görünceye veya switch parantezine kadar devam eder

        // not2: if -else if- ... -else yapısında olduğu gibi hiçbir şarta uymayanları
        //       default keyword kullanılır
        switch (gunNo){

            case 1 :
            System.out.println("pazartesi");
              break;
            case 2 :
            System.out.println("sali");
              break;
            case 3 :
            System.out.println("carsamba");
              break;
            case 4 :
            System.out.println("persembe");
              break;
            case 5 :
            System.out.println("cuma");
              break;
            case 6 :
            System.out.println("cumartesi");
              break;
            case 7 :
            System.out.println("pazar");
              break;
            default:
                System.out.println("geçerli gün numarası giriniz");
        }
    }
}
