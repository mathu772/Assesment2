import java.util.Scanner;

public class Problem9{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,i,j,m=0,a=0;
        for(i=1;i<=n;i++)
        {
           a=a+i;
         System.out.print(a+" :");
           for(j=1;j<=a;j++)
           {
               if(a%j==0)
               {
                   System.out.print(j+" ");
                   c++;
               }
               if(c>500)
               {
                   System.out.print( a);
                   break;
               }


           }
          System.out.println(" ");
        }

    }

    }


