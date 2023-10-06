package exp2;
import java.util.Scanner;

public class diagsum 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in); 
        int rows; 
        int columns;
        System.out.print("Enter number of rows: "); 
        rows = scanner.nextInt(); 
        System.out.print("Now enter the number of columns: "); 
        columns = scanner.nextInt(); 
        System.out.println("");
        int a[][] = new int [rows] [columns]; 
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("Enter the number for row " + i + " and column " + j + " : ");
                a[i][j] = scanner.nextInt();
            }
        }
        int k;
        int j;
	int sum1=0,sum2=0;
	for(j=0;j<a.length;j++)
        {
            for(k=0;k<a.length;k++)
            {
                System.out.print(a[j][k] + " ");
            }
	System.out.println();
	}
	for(j=0;j<a.length;j++) 
        {
            sum1=sum1+a[j][j];
	}
	k=a.length-1;
	for(j=0;j<a.length;j++) 
        {
            if(k>=0)
            {
                sum2=sum2+a[j][k];
		k--;
	    }
	}
	System.out.println("Sum of Diagonal elements are  :" +sum1+ " and "+sum2);
    }
}
