import java.util.Scanner;

public class Positivenegetive {
    //java main method
    public static void main(String[]args){
        int number;
        System.out.println("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        number =sc.nextInt();
        if (number <0.0)
            System.out.println(number +" is a negetive number.");
        else if (number >0.0)
            System.out.println(number +" is a positive number.");
        else
            System.out.println(number +"is 0.");


    }
}
