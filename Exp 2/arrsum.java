package exp2;

import java.util.Scanner;

public class arrsum {
    public static void main(String[] args) {
        int i;
        int sumev=0;
        int sumod=0;
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for(i=0;i<5;i++)
        {
           a[i]=s.nextInt(); 
        }
        System.out.println();
        System.out.println("The array elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        for(i=0;i<5;i++)
        {
            if(a[i]%2==0)
                sumev+=a[i];
            else
                sumod+=a[i];//sumod=sumod+a[i];
        }
        System.out.println();
        System.out.println("The sum of even numbers are: "+sumev);
        System.out.println();
        System.out.println("The sum of odd numbers are: "+sumod);
        
    }
    
}
