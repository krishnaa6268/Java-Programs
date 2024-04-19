import java.util.Scanner;

public class CircumferenceMathClass {
    double r;

    CircumferenceMathClass(double radInMM){
        this.r=radInMM;
    }

    @Override
    public String toString() {
        return "Circle props:-\n Radius in mm: "+ r +"\n Circumference in mm: "+ getCircumference()+"\n Area in mm2: "+getAreaCircle();
    }
    double getCircumference(){
        return (2*r*(Math.PI));
    }

    double getAreaCircle(){
        return (Math.pow(r,2)*(Math.PI));
    }

    public static void main(String[] args) {
        System.out.print("Enter Radius(in mm) of the circle: ");
        Scanner sc= new Scanner(System.in);

        double rad=sc.nextDouble();

        CircumferenceMathClass cs=new CircumferenceMathClass(rad);   // use to String methos to print object details all at once....
        System.out.println(cs);
        
        sc.close();
    }
}
