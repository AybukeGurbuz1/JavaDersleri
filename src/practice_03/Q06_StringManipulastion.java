package practice_03;

import java.util.Scanner;

public class Q06_StringManipulastion {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        // 1. yöntem
        String str="";
        System.out.println(str.contains(" ")?"bosluk var":"bosluk yok");
        System.out.println(str.isEmpty()?"string bos":"string bos degil");

        //2. yöntem
        String stra="aybüke";

        String straNonspace=str.replaceAll("\\s","");

        if(str.equals(straNonspace)){
            System.out.println("String bosluk icermiyor");
        }else{
            System.out.println("String bosluk iceriyor");
        }

        //3. yöntem
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci stringi giriniz: ");
        String str1=scan.nextLine();
        System.out.println("ikinci stringi giriniz: ");
        String str2= scan.nextLine();

        if(str1.contains(" ")){
            System.out.println("birinci string" + " : bosluk iceriyor");
        }else{
            System.out.println("birinci string" + " : bosluk icermiyor");

            if(str2.length()==0){
                System.out.println("ikinci string" + " : bos");
            }else{
                System.out.println("ikinci string" + " : bos degil");
            }
        }



    }
}
