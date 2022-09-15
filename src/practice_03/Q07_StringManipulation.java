package practice_03;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        // hocanın çözümü

        Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() <= 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");






        // 2. çözüm
        String input="java";

        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println(tersInput);
    }
}}
