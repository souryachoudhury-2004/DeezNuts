import java.util.*;
class date
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Today's Day (dd)");
int d=sc.nextInt();
System.out.println("Enter Today's Month (mm)");
int m=sc.nextInt();
System.out.println("Enter Today's Year (yyyy)");
int y=sc.nextInt();
System.out.println("Enter No. of Days ");
int n=sc.nextInt();
int mnth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int x=mnth[m]-d;
int d1=0;
n=n-x;
while(n>0)
{
m=m+1;
if(m==13)
{
m=1; y++;
}
d1=n%mnth[m];
n=n-mnth[m];
}
d=d1;
System.out.println("New Date: Day: "+d+" Month: "+m+" Year: "+y);
}
}