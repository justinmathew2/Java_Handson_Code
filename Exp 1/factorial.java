package exp1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S=new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n=S.nextInt();
        int fact=1;
        for(int i=n;i>1;i--)
        {
            fact=i*fact;
        }
        System.out.println("The factorial of the number "+n+" is "+fact);
    }
    
}
