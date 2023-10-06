package exp5;
import java.util.Scanner;
import pkg1.*;
import pkg2.*;
import pkg3.*;

public class Exp5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true)
        {
        System.out.println("\nChoice to do........,");
        System.out.println("1.Area of Square\n2.Area of Rectangle\n3.Area of Traingle\n4.Area of Circle\n5.Exit");
        System.out.print("\nEnter your choice: ");
        int p=s.nextInt();
            switch(p)
            {
                case 1:
                    //Area of Square
                    System.out.print("\nEnter the side of the square: ");
                    int side=s.nextInt();
                    Square t1=new Square();
                    t1.setSide(side);
                    t1.cal_area();
                    break;
                case 2:
                    //Area of Rectangle
                    System.out.print("\nEnter the length of the rectangle: ");
                    int len=s.nextInt();
                    System.out.print("Enter the breadth of Rectangle: ");
                    int bre=s.nextInt();
                    Rectangle t2=new Rectangle();
                    t2.setBreadth(len);
                    t2.setLength(bre);
                    t2.cal_area();
                    break;
                case 3:
                    //Area of Rectangle
                    System.out.print("\nEnter the height of the traingle: ");
                    int ht=s.nextInt();
                    System.out.print("Enter the base of the triangle: ");
                    int ba=s.nextInt();
                    Triangle a=new Triangle();
                    a.setBase(ba);
                    a.setHeight(ht);
                    a.cal_area();
                    break;
                case 4:
                    //Area of Circle  
                    System.out.print("\nEnter the radius of the circle: ");
                    int rd=s.nextInt();
                    Circle c1=new Circle();
                    c1.setRadius(rd);
                    c1.cal_area();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\nWrong choice!!!!Try again......");
                    break;
            
        }
        
    }
    
}

    }
    
