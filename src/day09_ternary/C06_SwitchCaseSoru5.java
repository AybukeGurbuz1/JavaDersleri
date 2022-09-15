package day09_ternary;

public class C06_SwitchCaseSoru5 {
    public static void main(String[] args) {
        //kullanıcıdan gün ismini alın haftaiçi veya haftasonu olduğunu yazdırın

        String input = "pazartesi";
        input =input.toLowerCase();

         switch (input) {
             case "pazartesi":
                 System.out.println("Hafta içi");
                 break;
             case "sali":
                 System.out.println("Hafta içi");
                 break;
             case "çarşamba":
                 System.out.println("Hafta içi");
                 break;
             case "perşembe":
                 System.out.println("Hafta içi");
                 break;
             case "cuma":
                 System.out.println("Hafta içi");
                 break;
             case "cumartesi":
                 System.out.println("Hafta sonu");
                 break;
             case "pazar":
                 System.out.println("Hafta sonu");
                 break;
             default:
                 System.out.println("lütfen geçerli bir gün giriniz");
         }
                 // kısa yol
                 switch (input){
                     case "pazartesi" :
                     case "sali" :
                     case "çarşamba" :
                     case "perşembe" :
                     case "cuma" :
                         System.out.println("Hafta içi");
                         break;
                     case "cumartesi" :
                         System.out.println("Hafta sonu");
                         break;
                     case "pazar" :
                         System.out.println("Hafta sonu");
                         break;
                     default:
                         System.out.println("lütfen geçerli bir gün giriniz");




         }
    }
}

