package in.kkcoding.Challenge77.utils;

import in.kkcoding.Challenge77.geometry.Circle;
import in.kkcoding.Challenge77.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle cir= new Circle(5.5);
        Rectangle rect=new Rectangle(10, 5);

        double cirArea=Math.PI*Math.pow(cir.r, 2);
        double rectArea=rect.breadth* rect.length;

        System.out.printf("Area of Circle: %f \nArea of Rectangle: %f",cirArea, rectArea);

    }
}
