import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double units,bill;
        System.out.println("enter the units");
        units=sc.nextDouble();
        if(units<=50 && units>=0)
        {
            bill=units*3.50;
            System.out.println("Electricity Bill in Rupees  :"+bill);
        }
        else if(units<=100 && units>50)
        {
            bill=50*3.50+(units-50)*4;
            System.out.println("Electricity Bill in Rupees  :"+bill);

        }
        else if(units<=250 && units>150)
        {
            bill=50*3.50+100*4+(units-150)*5.20;
            System.out.println("Electricity Bill in Rupees  :"+bill);

        }

        else if(units>250)
        {
            bill=50*3.50+100*4+100*5.20+(units-250)*6.50;
            System.out.println("Electricity Bill in Rupees  :"+bill);

        }
        else
        {
            System.out.println("enter the corrected units");
        }

       }
    }

