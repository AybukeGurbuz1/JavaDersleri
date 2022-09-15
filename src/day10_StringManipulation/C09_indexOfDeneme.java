package day10_StringManipulation;

public class C09_indexOfDeneme {
    public static void main(String[] args) {
        String input = "Javaya cok cok calisirsaniz is bulabilirsin";

        if (input.indexOf("kalem") == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }

        if (input.indexOf("cok") == 7 ){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }
    }

}
