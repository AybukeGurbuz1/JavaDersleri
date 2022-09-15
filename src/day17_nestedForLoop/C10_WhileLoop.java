package day17_nestedForLoop;

public class C10_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=10;

        while (!dogruMu){

            if (sayi>20) { // sart sagandıgında while loop un condition u false olmali
                System.out.println("bu islem tamam");
                dogruMu = true;
            }else{ // sart saglanmadıgı muddetce while loop un kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanmadı" + sayi);
                sayi++;

        }
    }
}}
