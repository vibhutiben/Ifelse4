import java.util.Scanner;

public class Turneryop {

    //java main method
    public static void main(String[]args){
        Scanner reader= new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num= reader.nextInt();
        String Turneryop=(num%2==0)? "even"  : "odd";
    System.out.println(num + " is " + Turneryop);}
}
