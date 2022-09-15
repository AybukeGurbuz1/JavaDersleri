package day07_IfStatement;

import java.util.Scanner;

public class IfElseIf_soru8 {
    public static void main(String[] args) {

         /*
        Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
                Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
                60 – 80.000 arasinda ise “Konusabiliriz”,
                60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen maas icin teklif sununuz");
        int teklif= scan.nextInt();
        if (teklif>80000){
            System.out.println("Kabul ediyorum");
        }else if (teklif>=60000 && teklif<=80000){
            System.out.println("Konusabiliriz");
        }else if (teklif<60000){
            System.out.println("Maalesef Kabul Edemem");
        }
    }
}
