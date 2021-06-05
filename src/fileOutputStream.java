import java.io.FileOutputStream;
import java.io.IOException;

class fileOutputStream {
    public static void main(String[] args)
    {
        FileOutputStream foutStr , foutStr1 , foutStr2;
        String filename = "E:\\LearnJava\\test1.txt" , filename1 = "E:\\LearnJava\\test2.txt" , filename2 = "E:\\LearnJava\\test3.txt";
        String toWrite = "My Name is Sayantan Das.";
        byte[] buffer = {97,98,99,100,101,102,103};
        int i=0;
        try
        {
            if (filename.compareTo("") == 0)
                throw new Exception  ("Empty filename...");
        }
        catch (Exception exp)
        {
            System.out.println(exp);
            System.exit(-1);
        }

        try
        {
            foutStr = new FileOutputStream(filename);
            while(i<toWrite.length())
                foutStr.write(toWrite.charAt(i++));
            System.out.println("Writing complete using void write(int)....");

            foutStr1 = new FileOutputStream(filename1);
            foutStr1.write(buffer);
            System.out.println("Writing complete using void write(byte[])....");

            foutStr2 = new FileOutputStream(filename2);
            foutStr2.write(buffer,2,5);
            System.out.println("Writing complete using void write(byte[] , offset , length)....");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}