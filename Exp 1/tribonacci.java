package exp1;
import java.util.Scanner;
public class tribonacci {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number till you want to print  tribonacci series: ");
        int num=s.nextInt();
        int a=0,b=1,c=1;
        int d=a+b+c;
        System.out.println("\nTribonacci Series: ");
        System.out.print(a+"\t"+b+"\t"+c);

        for(int i=4;i<=num;i++)
        {
            System.out.print("\t"+d);
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }

        System.out.println();
    }
    
}
