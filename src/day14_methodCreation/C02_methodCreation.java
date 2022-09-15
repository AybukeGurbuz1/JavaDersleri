package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_methodCreation {
    public static void main(String[] args) {
        // verilen 3 basamakli bir sayinin
        // rakamları toplamını yazdıran bir method oluşturalım
        // method call ile yapalim

        int input=423;

        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);

    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);


    }
}
