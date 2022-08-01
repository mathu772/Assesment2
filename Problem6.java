import java.util.Scanner;

public class Problem6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         System.out.println(" ");
         for(int i=n;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(i+" ");
             }
             System.out.println(" ");
             for(int k=n;k>i-1;k--)
             {
                     System.out.print(" ");

             }
         }
    }
}
