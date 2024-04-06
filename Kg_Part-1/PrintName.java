import java.util.*;

public class PrintName 
{
    public static void main(String[] args)
    {
        String str;
        System.out.print("Enter Name: ");
        Scanner obj=new Scanner(System.in);

        str=obj.nextLine();
        System.out.println("Name: "+str);

        obj.close();  // close obj for resourse leak..

    }
}
