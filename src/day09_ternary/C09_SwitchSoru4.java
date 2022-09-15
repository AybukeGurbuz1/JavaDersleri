package day09_ternary;

import java.util.Scanner;

public class C09_SwitchSoru4 {
    public static void main(String[] args) {

        // kullanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin
        // kullanıcı S girerse "Software"
        // kullanıcı D girerse "Devoloper"
        // kullanıcı E girerse "Engineer"
        // kullanıcı T girerse "In Testing" yazddırın

        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kısaltmasındaki harfleren birini yazınız");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'S' :
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("lütfen geçerli harf giriniz");


        }
    }
}
