import java.util.Scanner;

public class Vovelconsonant {
    //java main method
    public static void main(String[]args) {

        int i=0;

        System.out.println("Enter a character: ");


        Scanner scanner = new Scanner(System.in);
          char ch= scanner.next().charAt(0);

          if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o' || ch =='u') {
              System.out.println(" character is vowel ");
         }
         else
         {
            System.out.println("character is consinant");
         }


        }
    }

