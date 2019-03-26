import java.util.Scanner;

public class Passorfail {
    //java main maethod
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("bio: ");
        int bio=sc.nextInt();
        System.out.println("chem: ");
        int chem=sc.nextInt();
        System.out.println("phys: ");
        int phys=sc.nextInt();

        if(35<=bio && 35<=chem && 35<=phys)

        { System.out.println("pass");}
         else
        {System.out.println("fail");}




    }
}
