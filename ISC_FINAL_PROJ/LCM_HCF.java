import java.util.*;
class LCM_HCF
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.println("Enter 2 numbers.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int hcf = 0;
        //computing hcf
        for(int i = 1; i <= x; i++)
        {
            if(i <= x && i <= y && x%i == 0 && y%i == 0)
            {
                hcf = i;
            }
        }
        //printing hcf and lcm
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+(x*y)/hcf);
    }
}
