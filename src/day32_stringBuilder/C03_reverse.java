package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir inputu tersine çevirip
        // bize donduren bir method olusturun

        String input = "Hey gidi for loop gunleri";

        String tersInput = tersinecevir(input);

        System.out.println(tersInput);
    }

    public static String tersinecevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();


    }
}
