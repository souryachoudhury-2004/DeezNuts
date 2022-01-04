//HAS ISSUES
import java.util.*;  
public class LuckyNumber 
{  
int count = 2;  
//function that checks if the given number is lucky or not  
//returns 1 if the number is lucky, else returns 0  
boolean isLuckyNumber(int n)  
{  
if(count > n) 
{ 
return true; 
} 
if(n%count == 0)  
{
return false; 
}    
//determines the position of number  
n = n-(n/count);  
//increments the count variable by 1  
count++;  
return isLuckyNumber(n);  
}  
//main function
void main ()  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter beginning of range: ");   
//takes input of range
int l1= sc.nextInt();  
System.out.println("Enter end of range: ");
int l2 = sc.nextInt();
System.out.println("Lucky Numbers in the given range are = ");
//prints lucky numbers in the given range
for(int i = l1; i <= l2; i++)
{
if(isLuckyNumber(i) == true)
{
System.out.println(i);
}
}  
}  
}