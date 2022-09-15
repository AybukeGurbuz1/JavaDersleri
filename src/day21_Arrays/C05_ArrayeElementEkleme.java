package day21_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun


        String[] sinifListesi= {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanekle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanekle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi= new String[sinifListesi.length+1];//[null,null]
        // eski listeden 1 eleman fazla uzunlukta yeni bie array olusturdum
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //öncelşkle eski listedeki tum elemanlari, yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        //son index e ise eklenecek ismi atadim

        return yeniSinifListesi;
    }
}
