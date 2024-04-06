import java.util.Scanner;

public class GCD {
       public static void main(String[] args) {
        int a,b,gr,sh;
        System.out.println("Enter Two Numbers: ");
        Scanner sc= new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        gr=a>b?a:b;
        sh=a<b?a:b;

        GCDFunc(gr, sh);

        sc.close();
    }
    public static void GCDFunc(int gr, int sh)
    {
        int hcf=0;
        
        while(hcf>=0){
            hcf=gr%sh;

            if(hcf==0)
            {
                System.out.println("HCF: "+sh);
                break;
            }
             gr=sh;
             sh=hcf;  
        }
    }
}
