package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));  // false

        System.out.println(sb1.equals(sb1)); // true

        // StringBuilder da equals methodu ancak ayni obje olursa true doner
        // string deki gibi dusunmemek lazım

        System.out.println(sb1.equals(str));  // false ,itiraz etmiyor ama her zaman false doner

        System.out.println(sb1.compareTo(sb2));  // 0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));  //-4

        /*
        compareTo() methodu iki stringBuilder ı bastan baslayarak
        harf harf karsilastirir
        ilk harfler ayni ise ikincilere gecer
        ikinciler ayni ise ücüncülere gecer ve
        ilk farklı olan harfe kadar gider
        farklı olan iki harfin ascii
        kodlari arasındaki farkı verir

        eger hic farklı harf yoksa
        sonuc sıfır dondurur
         */
    }
}
