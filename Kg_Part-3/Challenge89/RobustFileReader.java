package in.kkcoding.Challenge89;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the File Name,which you want to read: ");
        String fileName= input.next();

        try(FileReader reader = new FileReader(fileName))
        {
            int read;
            while((read=reader.read())  !=  -1)
            {
                System.out.print((char)read);
            }
        }catch(FileNotFoundException ex)
        {
            System.out.println("Exception occured: "+ex.getMessage());
        }catch (IOException e)
        {
            System.out.println("Exception occured: "+e.getMessage());
        }

    }
}
