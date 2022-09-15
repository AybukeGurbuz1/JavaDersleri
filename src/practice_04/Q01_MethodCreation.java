package practice_04;

public class Q01_MethodCreation {
     /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
     public static void main(String[] args) {
          birkereYazdir("abbbbaaaccccddddeeee");

     }


     private static void birkereYazdir(String str) {
          String output = "";  // string default degeri "" oldugu icin isleme etki etmesin diye bu sekilde atadık

          // int i= 0; i<= str.lenght()-1 ; i++ sekilde de olur
          for (int i = 0; i < str.length() ; i++)
               if (!output.contains(str.substring(i, i + 1))) { // tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimz herhangi bir karaktri icermesin
                    output += str.substring(i, i + 1); // o zmn sonuca eklesin
               }
          System.out.println(output);
}}
