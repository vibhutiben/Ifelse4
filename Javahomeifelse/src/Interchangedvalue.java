import java.util.Scanner;

public class Interchangedvalue {
    // java main method
    public static void main(String[]args){

        int x;
        int y;
        int z;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first value: ");
        x=scanner.nextInt();
        System.out.println("Enter second value: ");
        y=scanner.nextInt();

        z=x;
        x=y;
        y=z;
        System.out.println("Interchange the value: "+x+ "and "+y);
    }
}
