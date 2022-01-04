import java.util.*;
class plane_points
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.println("Enter X coordinates of both points.");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Enter Y coordinates of both points.");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        //computing distance
        double dist = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        System.out.println("Distance between points = "+dist);
    }
}
