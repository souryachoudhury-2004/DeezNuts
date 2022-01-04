import java.util.*;
class Decimal_Base_Conversion
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        //takes input
        System.out.println("Enter decimal number.");
        int num = sc.nextInt();
        System.out.println("Enter base.");
        int base = sc.nextInt();
        int num1 = 0;
        //converts
        while(num >= base)
        {
            num1 = (num1*10)+(num%base);
            num /= base;
        }
        num1 = (num1*10)+num;
        num = 0;
        int d = 0;
        //reverses
        while(num1 >= 1)
        {
            d = num1%10;
            num = num*10+d;
            num1 /= 10;
        }
        System.out.println("Number in base "+base+" : "+num);
    }
}
