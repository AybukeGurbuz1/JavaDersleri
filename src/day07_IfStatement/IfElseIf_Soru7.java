package day07_IfStatement;

import java.util.Scanner;

public class IfElseIf_Soru7 {
    public static void main(String[] args) {

         /*
       Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
                50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir not giriniz");

        double puan= scan.nextDouble();
        if (puan>0 && puan<50){
            System.out.println("Notunuz : D");
        }else if (puan>=50 && puan<60){
            System.out.println("Notunuz : C");
        }else if (puan>=60 && puan<80){
            System.out.println("Notunuz : B");
        }else if (puan>=80 && puan<=100){
            System.out.println("Notunuz : A");
        }else{
            System.out.println("Lutfen gecerli bir not giriniz");
        }
    }
}
