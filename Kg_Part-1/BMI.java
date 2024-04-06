import java.util.Scanner;

public class BMI 
{
    public static void main(String[] args)
    {
      float H=0, W=0;

      Scanner myObj = new Scanner(System.in); // Create a Scanner object...
      System.out.println("Enter Weight(kg)"+W);

      W = myObj.nextFloat();

      System.out.println("Enter Height(cm)"+H);

      H = myObj.nextFloat();
      H=H/100; //now convert in meter...
      H=H*H;

      float BMI=0;
      BMI=W/H; //Logic...

     // System.out.println("BMI:"+BMI);
     //printing the result   
      if(BMI >= 16 && BMI <= 18.5)
      {
        System.out.println("BMI:"+BMI+" Underweight!");
      }
      if(BMI >= 18.5 && BMI <= 25)
      {
        System.out.println("BMI:"+BMI+" Normal!");
      }
      if(BMI >= 25 && BMI <= 40)
      {
        System.out.println("BMI:"+BMI+" Overweight!");
      }
      if(BMI > 40)
      {System.out.println("BMI:"+BMI+" Obese!"); }
      

      myObj.close();
    }
  }