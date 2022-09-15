package practice_01AND02;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Y/N ikilisinden birini giriniz :");
        char karakter = scan.next().charAt(0);  // string de olur ama tek karakter olduğu için char olsun

        if (karakter=='Y' || karakter=='y' ){
            System.out.println("yes");

        }else if (karakter=='N' || karakter=='n'){
            System.out.println("No");

        }else
            System.out.println("yanlis giris yaptiniz, lutfen sadece Y/N ikilisinden birini tercih ediniz");

    }
}
