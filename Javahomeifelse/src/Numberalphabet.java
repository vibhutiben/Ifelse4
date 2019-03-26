import java.util.Scanner;

public class Numberalphabet {

    // jav main method
    public static void main(String[]args)
    {System.out.println("Enter any character,number or symbol");

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if (input.matches("[a-zA-Z]"))
        {System.out.println("This is alphabet");}
        else if (input.matches("[0-9]"))
    {System.out.println("This is number");}
            else{
                System.out.println("This is symbol");
            }


        }
    }