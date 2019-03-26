import java.util.Scanner;

public class Cityname {
//java main method
    public static void main(String[]args) {
       String a,b,c,d,e,f;
      char ch;
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        ch=name.next().charAt(0);

       if (ch=='a' )
       {System.out.println("ahmedabad ");}
        else if(ch=='b') {System.out.println( "bombay");}


         else if (ch=='c'){System.out.println("chennai");}

        else if(ch=='d')   {System.out.println("delhi");}
        else if(ch=='e'){System.out.println("ellora");}
        else if(ch=='f'){System.out.println("faridabad");}
        else {System.out.println("Entered in valid character.");}

    }
    }
