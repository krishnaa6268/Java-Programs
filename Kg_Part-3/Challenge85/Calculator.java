package in.kkcoding.Challenge85;

public class Calculator {

    public  int add(int a, int b){
        return (a+b);
    }
    public  double add(double a, double b){
        return (a+b);
    }
    public  int add(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        Calculator overload=new Calculator();
        int sum1= overload.add(45,55);
        double sum2= overload.add(4.5,5.5);
        int sum3= overload.add(4,5, 11);

        System.out.println("Addition(2 int): "+ sum1);
        System.out.println("Addition(Double): "+ sum2);
        System.out.println("Addition(3 int): "+ sum3);

    }
}
