public class PatternOne {
    public static void main(String[] args) {
        Pattern1();
        System.out.println(" ");
        Pattern2();
        System.out.println(" ");
        Pattern3();
     
    }

    public static void Pattern1()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
      
    }

    public static void Pattern2()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=(6-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
      
    }

    public static void Pattern3()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=(6-i))
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
      
    }
}
