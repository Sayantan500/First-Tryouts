import java.io.FileInputStream;
import java.io.IOException;

class fileInputStream
{
    public static void main(String[] args)
    {
        FileInputStream finStr , finStr1, finStr2;
        String filename = "E:\\LearnJava\\test1.txt" ,
                filename1 = "E:\\LearnJava\\test2.txt" ,
                filename2 = "E:\\LearnJava\\test3.txt";
        byte[] buffer = new byte[10];
        int i = 0;
        try
        {
            if(filename.compareTo("")==0)
                throw new Exception("Empty filename...");
        }
        catch(Exception exp)
        {
            System.out.println(exp);
            System.exit(-1);
        }

        try //try with resource variation of try-catch
        {
            System.out.println("Use of int read() method ->");
            finStr = new FileInputStream(filename);
            while(finStr.available()>0)
                System.out.print((char)finStr.read());

            System.out.println("\n\nUse of int read(byte[]) method ->");
            finStr1 = new FileInputStream(filename1);
            finStr1.read(buffer);
            for (byte b:buffer)
                System.out.println((i++) +" " +(char)b);

            System.out.println("\n\nUse of int read(byte[],offset,numBytes) method ->");
            finStr2 = new FileInputStream(filename2);
            finStr2.read(buffer,3,6);
            i=0;
            for (byte b:buffer)
                System.out.println((i++) +" " +(char)b);
        }
        catch(IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }



    }
}