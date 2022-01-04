//Generates a magic square of order n
import java.util.*;
class MagicSq
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Give an odd number: ");
//taking input
int n = sc.nextInt();
int m[][] = new int[n][n];
int number = 1;
int row = 0;
int column = n / 2;
//generating square
while (number <= n * n)
{
m[row][column] = number;
number++;
row -= 1;
column += 1;
if (row == -1) 
{
row = n - 1;
}
if (column == n) 
{
column = 0;
}
if (row == 0 && column == n - 1) 
{
column = n - 1;
row += 1;
} 
else if (m[row][column] != 0) 
{
row += 1;
}
}
for(int i = 0; i < m.length; i++) 
{
for(int j = 0; j < m.length; j++) 
{
System.out.print(m[i][j] + "  ");
}
System.out.println();
}
}
}