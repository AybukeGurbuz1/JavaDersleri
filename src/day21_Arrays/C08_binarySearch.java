package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {


    /*
    binary search java da eleman aramanın kısa yoludur
    ancak binary searc hın calismasi icin önce
    array in sirali hale getirirlmesi gerekir
    eger siralama yapmadan binary search yaparsanız
    sonucu bulamayabilir veya yanlıs bulanilirsiniz
     */

        String[] harfler = {"Y", "B", "D", "G", "O"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


        // binarySearch bize aradigimiz elemanin index inin dondurur
        // array sirali olmadigi icin arama  sonucunu dogru bulmayabilir
        // emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));



    }

}
