import java.util.*;
class date_validity
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in dd/mm/yy format.");
        String date = sc.nextLine();
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, date.length()));
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year%4 == 0 && year%100 != 0)||(year%400 == 0 && year % 100 == 0))
        {
            month_days[1] = 29;
        }
        if(month < 1 || month > 12)
        {
            System.out.println("Month is invalid; hence date is invalid.");
        }
        else if(month_days[month-1] < day)
        {
            System.out.println("Day is invalid; hence date is invalid.");
        }
        else
        {
            System.out.println("Date is valid.");
        }
    }
}
