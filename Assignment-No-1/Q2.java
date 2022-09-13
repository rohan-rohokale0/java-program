import java.io.*;
class Accept
{
    public static void main(String arg[])throws IOException
    {
        int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input:");
         num =Integer.parseInt(br.readLine());
         if(num>0)
         {
         System.out.print("Output:");
         for(int i=1;i<=num;i++)
         {
                System.out.print("\t"+i*2);
         }
         }
         else
         {
            System.err.print("Please Valid Number");
         }
    }
}