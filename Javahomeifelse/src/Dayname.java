import java.util.Scanner;

public class Dayname {

    //java main method
    public static void main(String[]args){
    int day;

        System.out.println("Enter a number: ");
        Scanner sc =new Scanner(System.in);
       day =sc.nextInt();
        if (day ==1)
            System.out.println("Day of the week is  Sunday");
        else if (day==2)
            System.out.println(" Day of the week is Monday");
        else if(day==3)
            System.out.println( "Day of the week is Tuesday");
        else if(day==4)
            System.out.println( "Day of the week is Wednesday day");
        else if(day==5)
            System.out.println( "Day of the week is Thursday day");
        else if(day==6)
            System.out.println( "Day of the week is Friday");
        else if(day==7)
            System.out.println( "Day of the week is Saturday");
    }
}

