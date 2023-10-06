package pkg2;
import pkg1.*;

public class Square extends Shape{
     private int side;
    @Override
    public void cal_area(){
            System.out.println("Area of Square is: "+(side*side));
            
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
        
}
