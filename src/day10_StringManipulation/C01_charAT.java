package day10_StringManipulation;

import java.util.Locale;

public class C01_charAT {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdırır

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21));  // l

        //System.out.println(str.charAt(22))  // stringındexoutofboundsexception
        //son harfi bulmak için str nin uzunlığunun
    }
}
