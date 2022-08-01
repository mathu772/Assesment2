import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double amount,rate,year;
        amount= sc.nextDouble();
        rate=sc.nextDouble();
        year= sc.nextDouble();
        rate=rate*0.01;
        for(int i=1;i<=year;i++)
        {
            {
                int formatter = 19;
                if (i >= 10) formatter = 18;
                System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(amount, rate/12, i));
            }
        }
    }

    private static double futureInvestmentValue(double amount, double v, int i) {
        return amount * Math.pow(1 + v, i * 12);
    }

}

