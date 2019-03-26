import java.util.Scanner;

public class Grosssalary {
    //java main method
    public static void main(String[]args){


    double basicsalary,DA,HRA,TA,PF,Grosssalary;

    Scanner reader=new Scanner(System.in);
    System.out.println("Enter employee ID: ");
    int id=reader.nextInt();
    System.out.println("Enter the name of employee; ");
    String name=reader.next();
    System.out.println("Enter basic salary: ");
     basicsalary=reader.nextDouble();


     DA=(basicsalary*8)/100;
     HRA=(basicsalary*10)/100;
     TA=(basicsalary*9)/100;
     PF=(basicsalary*20)/100;

     Grosssalary=basicsalary+DA+HRA+TA-PF;

     System.out.println("Dearness allownce: " +DA);
     System.out.println("House rent allownce: "+ HRA);
     System.out.println("travel allownce: "+TA);
     System.out.println("providend fund: "+PF);
     System.out.println("Gross salary: "+Grosssalary);





    }
}
