package day10_StringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));  //  5
        System.out.println(str.indexOf('g'));  // 6
        System.out.println(str.indexOf("t"));   // bana integer donduruyor
                                                  // int de yok diye bir değer yok
                                                  // 0 dersek  J nin index idir
                                                  // - bir değer dönerse b, aranan string in str deolmadığını
                                                  // java -1 döndürmeyi tercih etmiştir

        String str5 = "jvfvjdvk;ldvlkdlsdkvmdkxlkacksklllllsşeofkkkkkkkkkkvmvfolseplsld";

        // str5 de p harfi vr mıdır
        if (str5.indexOf("p")==-1) {
            System.out.println("str5 de istenen karakter kullamılmamıs");

        }else{
            System.out.println("str5 de istenen karakter kullamılmamıs");
        }

    }
}

