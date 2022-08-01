import java.util.Scanner;

public class Problem7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (j=0;j<n;j++)
        {
            b[j]=sc.nextInt();
        }
        for( i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for (j=0;j<n;j++)
        {
             System.out.print(b[j]+" ");
        }
         System.out.println("\n");
        System.out.print("Duplicate elements :");
        for(i=0;i<n;i++)
        {
            for (j = 0; j < n; j++)
            {

                if (a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}

