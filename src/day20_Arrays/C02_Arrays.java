package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        int sayilar []=new int[3];

        System.out.println(sayilar);  //I@58ceff1
        // non primitive türünde ki dataları
        // her zaman direk yazdıramayız
        // Array i yazdirmak istersek arrays classon dan yadım isteriz

        System.out.println(Arrays.toString(sayilar));  // [0,0,0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar); //[I@7a0ac6e3
        System.out.println(Arrays.toString(sayilar));  // [5,3,10]

        String siniflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniflist)); // [ali, ayse, ahmet]

       siniflist[1]="Hasan";

        System.out.println(Arrays.toString(siniflist)); // [ Ali, Hasan, Ahmet]

        System.out.println(siniflist[1]);   // hasan ı yazdıralım
        System.out.println(siniflist[0]);   // Ali
    }

}
