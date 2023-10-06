package exp2;

import java.util.Scanner;

public class commonarr {
    public static void main(String[] args) {
         int i,j;
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first array elements: ");
        for(i=0;i<5;i++)
        {
           a[i]=s.nextInt(); 
        }
        System.out.print("Enter the second array elements: ");
        for(i=0;i<5;i++)
        {
           b[i]=s.nextInt(); 
        }
        System.out.println("");
        System.out.print("The first array elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("The second array elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("");
        int cnt=0;
        System.out.print("Common elements between two arrays: ");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(a[i]==b[j])
                {
                cnt++;
                System.out.print(a[i]);
                System.out.print(" ");
                }
                
            }
        }
        if(cnt==0)
            System.out.println("Not Found!!!");
        
       
    }
    
    
}
