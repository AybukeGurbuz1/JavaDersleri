package practice_03;

import java.util.Scanner;

public class Q05_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi ve soyismizi giriniz :\nisim");
        String isim = scan.next();
        System.out.print("soyisim");
        String soyisim = scan.next();

        if(isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");
    }else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminiz ile esit uzunlukta");
        }else System.out.println("soyisminiz isminizden uzun");
}}
