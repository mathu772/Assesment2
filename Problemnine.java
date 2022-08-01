import java.util.Scanner;

public class Problemnine
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            int i,j,counter,max,a;


            a=0;
            max=0;
            for(i=1;i<13000;i++)
            {
                a=a+i;
                counter=0;
                for (j=1;j<=1000000;j++)
                {
                    if(a%j==0)
                    {
                        counter++;
                    }
                    if (counter>max)
                    {
                        max=counter;

                    }
                    if (max == 500)
                    {
                        System.out.print(a);
                        break;

                    }
                }
                System.out.println(a+" "+max);
            }
        }
    }

