package pkg3;
import pkg1.*;

public class Triangle extends Shape{
    private int base;
    private int height;
    @Override
    public void cal_area()
    {
        System.out.println("Area of Triangle is: "+(base * height*0.5)); 
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight(int height) {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
