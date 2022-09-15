package day12_stringManipulations;

public class C06_soru1 {
    public static void main(String[] args) {

        // soru 1) String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ "
        //         stringini "java ogrenmek cok guzel." sekline getirin

        String str=" Java ogrenmek123 Cok guzel@  ";

        str=str.replaceAll("\\s","qw");
        str=str.replaceAll("\\d","");
        str=str.replaceAll("qw"," ");
        str=str.replace("C","c");
        str=str.replace("@", ".");
        System.out.println(str);
}}
