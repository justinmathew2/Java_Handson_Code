package exp2;

import java.util.Scanner;

public class mergearr {
    public static void main(String args[]){
        int i;
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first array elements: ");
        for(i=0;i<5;i++)
        {
           a[i]=s.nextInt(); 
        }
        System.out.println("Enter the second array elements: ");
        for(i=0;i<5;i++)
        {
           b[i]=s.nextInt(); 
        }
        System.out.println();
        for(i=0;i<5;i++)
        {
            c[i]=a[i];
        }
        int j;
        for(j=0,i=5;i<10;j++,i++)
        {
            if(j==5)
                break;
            c[i]=b[j];
        }
        System.out.println("The merged array elements: ");
        for(i=0;i<10;i++)
        {
            System.out.print(c[i]);
            System.out.print(" ");   
        }
    }
    
}
