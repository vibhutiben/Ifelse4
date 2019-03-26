import java.util.Scanner;

public class Grade {
    //java main method
    public static void main(String[]args){

        float percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Student name: ");
        String name=sc.next();
        System.out.println("Student roll no: ");
        int rollno=sc.nextInt();
        System.out.println("bio: ");
        int bio=sc.nextInt();
        System.out.println("chem: ");
        int chem=sc.nextInt();
        System.out.println("phys: ");
        int phys=sc.nextInt();

        float total=bio+chem+phys;
        percentage=(total/300)*100;
        System.out.println("Total is "+total);

        System.out.println("percentage is " +percentage+"%");
        if(percentage>=80){System.out.println("Pass and Grade is : A+");}
        else if(percentage>=60){System.out.println("Pass and Grade is :A");}
        else if(percentage>=50){System.out.println("Pass and Grade is :B");}
        else if(percentage>=35){System.out.println("Pass and Grade is :C");}
        else {System.out.println("Fail");}

    }
}
