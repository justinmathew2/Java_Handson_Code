package exp2;

import java.util.Scanner;

public class sortarr {
    public static void main(String[] args) {
        int temp;
        int i,j;
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
        int count=0;
        for(i=0;i<5;i++)
        {
            for(j=i;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                    
                 
            }
           
        }
        System.out.println("The sorted elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("The second minimum element is: "+a[1]);
        System.out.println("The second maximum element is: "+a[3]);
    }
    
    
}
