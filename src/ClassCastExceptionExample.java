import java.util.ArrayList;
import java.util.Arrays;

class ClassCastExceptionExample
{
    public static void main(String[] args) {
        String[] s = {"A","B"};
        ArrayList<String> str=null;
        try {
            str = (ArrayList<String>) Arrays.asList(s);
            System.out.println("Executed try block");
        } catch (ClassCastException e) {
           System.out.println("Exception occurred :" + e);
        } finally {
            System.out.println("Finally : "+str);
        }
        System.out.println("Done");
    }
}