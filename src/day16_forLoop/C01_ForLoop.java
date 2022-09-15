package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim

        int input=120;

        for (int i = 1; i <=input ; i++) {    // 1 den 20 ye kadar aynı işlemi yapmalı
            

            if (input%i==0){               // input i ye tam bölünüyor demek
                System.out.print(i + " ");
            }
        }
    }
    }

