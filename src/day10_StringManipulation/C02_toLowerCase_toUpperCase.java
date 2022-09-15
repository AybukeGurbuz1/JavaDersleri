package day10_StringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args, Locale locale) {

        String str="Beni psıkopata baglamayin";


        System.out.println(str.toUpperCase()); // BENI PSIKOPATA BAGLAMAYIN


        System.out.println(str.toUpperCase(locale.forLanguageTag("Tr")));

        // eğer buyuk kucuk harf dönüşümünde local bir dili esas almak isterseniz bu method kullanılır
    }
}
