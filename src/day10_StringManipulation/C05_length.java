package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());  // str nin karakter sayısını döndürür  19

        System.out.println(str.charAt(str.length()-1));     //   son karakterini yazdıralım

        System.out.println(str.charAt(str.length()-3));   //  sondan 3. karakterini yazdıralım

        // java da null pointer (işaretleyici) bir değer değil
        // karşısına yazıldığı variable ın hiç bir değer olmadığının işaretcisidir

        String str2= "";  // str2 ye bir değer atanmış mıdır   EVET
                          // bu değer nedir hiçlik
        System.out.println(str2.length());  //  0

        String str3=null; // str3 e bir değer atanmışmıdır HAYIR
                          // null  bu değer atamamayı işaret etmektedir
        System.out.println(str3.length());  // bir değer atanmamış ki nasıl uzunluğu olsun
                                            // NullPointerException olarak hata verir


    }
}
