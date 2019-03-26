import java.util.Scanner;

public class Average {
    //java main method
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first nymber: ");
        Double a =scanner.nextDouble();
        System.out.println("Enter second nymber: ");
        Double b =scanner.nextDouble();
        System.out.println("Enter third nymber: ");
        Double c =scanner.nextDouble();
        System.out.println("Enter fourth nymber: ");
        Double d =scanner.nextDouble();
        System.out.println("Enter fifth nymber: ");
        Double e =scanner.nextDouble();
        System.out.println("Average of "+a+","+b+","+c+","+d+","+e+"="+(a+b+c+d+e)/5);
    }
}
