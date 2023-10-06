package exp1;
import java.util.Scanner;
public class primenos {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num,num1,count,i,j;
        System.out.println("Enter the range between which prime numbers are to be printed: ");
        System.out.print("Enter the starting number: ");
        num=s.nextInt();
        System.out.println("");
        System.out.print("Enter the ending number: ");
        num1=s.nextInt();
        System.out.println("");
        System.out.println("The numbers between the range"+num+" and "+num1+" is: ");
        for(i=num;i<=num1;i++)
        {
            count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(i+" ");
            }
        }
        
        System.out.println("");
    }
}
