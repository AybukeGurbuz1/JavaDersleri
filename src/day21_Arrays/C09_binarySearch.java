package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {


    /*
    binary search methodu siralanmis array de aradigimiz elementin index ini dondurur

    ya aradigimiz element array de yoksa ?

    (String de indexOf() bize olmayan elementler için -1 donduruyordu)

    aradıgımız element array de yoksa hem olmadigini ,
    hemde olsaydi nerede olacagini bize dondurur

    olmadigini ifade icin - kullanir
    olsaydi

     */

    int [] sayilar = {3,7,15,4,27,10};

    Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); //  [0,1,3,4,5,7]
        // varsa index ,yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)) ; // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1





}}
