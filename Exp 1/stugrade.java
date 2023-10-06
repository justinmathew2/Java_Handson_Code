package exp1;
import java.util.Scanner;
public class stugrade {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int marks;
        String Grade = null;
        System.out.println("Enter the mark of a subject: ");
        marks=s.nextInt();
        if(marks>=95)
            Grade="0";
        else if(marks>=90&&marks<95)
            Grade="S";
        else if(marks>=80&&marks<90)
            Grade="A";
        else if(marks>=70&&marks<80)
            Grade="B";
        else if(marks>=60&&marks<70)
            Grade="C";
        else if(marks>=50&&marks<60)
            Grade="D";
        else
            Grade="Fail";
         System.out.println("The grade of the marks obtained is: "+Grade);
    }
}
