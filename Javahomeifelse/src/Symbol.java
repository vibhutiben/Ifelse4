import java.util.Scanner;

public class Symbol {

    //jav main method
    public static void main(String[]args){
        int x,y,res;
        char ch;
        Scanner scanner=new Scanner(System.in);

        System.out.println(" Enter first integer number:");
         x=scanner.nextInt();
        System.out.println("Enter second integer number:");
         y=scanner.nextInt();
         System.out.println("Enter operator (+,-,*,/):)");
         ch =scanner.next().charAt(0);
         if(ch=='+'){res=x+y; System.out.println("Result="+res);}
     else if (ch=='-'){res=x-y; System.out.println("Result="+res);}
     else if (ch=='*'){res=x*y; System.out.println("Result="+res);}
     else if(ch=='/'){res=x/y; System.out.println("Result="+res);}
    }
}
