import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a,b,gt,s;
        System.out.println("Enter Two Numbers: ");
        Scanner sc= new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        gt=a>b?a:b;
        s=a<b?a:b;

        LcmFunc(gt, s);

        sc.close();
    }
    public static void LcmFunc(int gt, int s)
    {
        int lcm=1;
        
        for(int i=1; (lcm=gt*i)%s>=0; i++){
            if(lcm%s==0)
                break;
        }
        System.out.println("LCM: "+lcm);
    }
}
