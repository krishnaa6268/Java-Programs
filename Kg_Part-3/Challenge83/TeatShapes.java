package in.kkcoding.Challenge83;

public class TeatShapes {
    public static void main(String[] args) {
        // Shape sp=new Shape();  //no obj created cause of abstract class...

        Circle c=new Circle(5);
        Square s=new Square(16);

        System.out.printf("Circle Area: %5.2f \nSquare Area: %5.2f",c.calculateArea(), s.calculateArea());

    }
}

