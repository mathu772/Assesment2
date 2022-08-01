public class Problem8
{
    public static void main(String[] args)
    {
        //(483*483*483+ 517*517*517) / (517*517 - 517*483 + 483*483)6.
        int a,b,c;
        a=(483*483*483+517*517*517);
        b=(517*517-517*483+483*483);
        System.out.println(a);
        System.out.println(b);
        c=(a)/(b)*6;
        System.out.print(c);
    }
}
