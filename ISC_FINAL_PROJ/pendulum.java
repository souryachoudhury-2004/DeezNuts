import java.util.*;
class pendulum
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many numbers u want to enter [odd number is allowed]: ");
int n=sc.nextInt();
if(n%2==0)
System.out.println("Wrong Input, Enter odd number");
else
{
int a[]=new int[n];
int b[]=new int[n];
System.out.println("Enter "+n+" numbers:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}       //end of for i
int k=0,t=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}       //end of if
}       //end of j loop
}       //end of i loop
k=n/2;
//transferring the elements
b[k]=a[0]; k--;
for(int i=1;i<n;i+=2)
{
b[k--]=a[i];
}       //end of i loop
k=n/2+1;
for(int i=2;i<n;i+=2)
{
b[k++]=a[i];
}       //end of i loop
System.out.println("Original numbers:");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}       //end of i loop
System.out.println();
System.out.println("Resultant numbers:");
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}       //end of i loop
}       //end of else
}       //end of main()
}       //end of class