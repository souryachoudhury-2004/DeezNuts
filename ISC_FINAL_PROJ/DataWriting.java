//enters data in a performance.txt file
import java.io.*;
class DataWriting
    {
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String name;
            int phy,chem,bio,total=0;
            double avg=0.00;
            String grade="";
            FileWriter s=new FileWriter("performance.txt");
            BufferedWriter m=new BufferedWriter(s);
            PrintWriter ob=new PrintWriter(m);
            System.out.println("Enter details for 5 students");
            for(int i=1;i<=5;i++)
            {
                System.out.println("Enter name of student");
                name=br.readLine();
                System.out.println("Enter marks in physics, chemistry and biology");
                phy=Integer.parseInt(br.readLine());
                chem=Integer.parseInt(br.readLine());
                bio=Integer.parseInt(br.readLine());
                total=phy+chem+bio;
                avg=total/3.0;
                ob.println(name);
                ob.println(phy);
                ob.println(chem);
                ob.println(bio);
                ob.println(total);
                ob.println(avg);
                if(avg>=80)
                grade="A";
                if(avg>=60 && avg<80)
                grade="B";
                if(avg>=40 && avg<60)
                grade="C";
                if(avg<40)
                grade="D";
                ob.println(grade);
            }
            ob.close();
        }
    }
