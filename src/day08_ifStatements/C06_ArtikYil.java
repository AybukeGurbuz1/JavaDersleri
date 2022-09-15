package day08_ifStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("lutfen yil giriniz");

        int yil = Scan.nextInt();
        if(yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println("artık yıl");
                }else
                    System.out.println("artık yıl değil");
            }else
                System.out.println("artık yıl");
        }else
            System.out.println("artık yıl değil");

    }
}
