package day07_IfStatement;

import java.util.Scanner;
import java.util.Set;

public class C04_BasicIfStatements {
    private static final Set<String> GIRILEN_GUNS = Set.of("pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar");

    public static void main(String[] args) {
         /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:      gun=Pazar output = “Hafta sonu”
                    gun=Sali  output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();

        // Pazar, pazar, PAZAR, PaZar, PAzar ??? bilemeyiz,
        // pazar, pazar, pazar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!GIRILEN_GUNS.contains(girilenGun)){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

    }
}
