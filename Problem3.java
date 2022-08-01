import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        matxix(n);

    }

    private static void matxix(int n) {
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
            System.out.print((int)(Math.random() * 2) + " ");
           }
        System.out.println(" ");
       }

    }
}
