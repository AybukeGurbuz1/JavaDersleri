package day13_MethodCreation;

public class C01_StringManipulation {

     /*
    Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
    -String str1 = "$13.99"
    -String str2 = "$10.55"
    ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
     */

    public static void main(String[] args) {

        String str1 = "$13,99";
        String str2 = "$10,55";

        str1=str1.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str1);

        str2=str2.replaceAll("\\D","");

    }
}
