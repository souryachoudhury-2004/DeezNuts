import java.io.*;
class DataReading
    {
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String name=" ";
            int phy,chem,bio,total;
            double avg;
            String grade;
            FileReader s=new FileReader("performance.txt");
            BufferedReader m=new BufferedReader(s);
            int r=0;
            boolean eof=true;
            while(eof)
            {
                name=m.readLine();
                if(name==null) break;
                phy=Integer.parseInt(m.readLine());
                chem=Integer.parseInt(m.readLine());
                bio=Integer.parseInt(m.readLine());
                total=Integer.parseInt(m.readLine());
                avg=Double.parseDouble(m.readLine());
                grade=m.readLine();
                System.out.println(name+" "+total+" "+avg+" "+"Grade-"+grade);
                r=r+1;
                name=" ";
            }
            System.out.println("total number of records= "+r);
            m.close();
        }
    }
