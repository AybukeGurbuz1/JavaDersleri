package practice_01AND02;

public class Q02_Println_vs_print {

     //println() ve print arasında tek fark var;
     //println satir atliyor;
    //print ise imlecin ayni satirda kalmasını sağlıyor.

    public static void main(String[] args) {
        System.out.println("****println****");
        System.out.println("Welcome");
        System.out.println("java");
        System.out.println("practice");

        System.out.println("****print****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" class");
    }
}
