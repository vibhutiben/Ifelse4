import java.util.Scanner;

public class Eligiblevote {
    // java main method
    public static void main(String[]args){

        int age;
        System.out.println("Enter the age: ");

        Scanner number=new Scanner(System.in);
        age=number.nextInt();

        if (age>=18){
            System.out.println("His/her is eligible to vote.");}
            else {System.out.println("His/her is not eligible to vote.");}
        }
    }

