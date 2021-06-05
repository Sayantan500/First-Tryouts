import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaptureAllException
{
    static List<String> array = Arrays.asList("class java.lang.ArithmeticException" , "class java.lang.ArrayIndexOutOfBoundsException", "class java.lang.NumberFormatException");

    public static void main(String[] args)
    {
        boolean flag = true;
        int a = 10 , b = 0 , c = 0 , d, e = 0 , index = 3 , expNo;
        String s = "a";
        int []ar = new int[]{1,2};
        while(flag)
        {
            try
            {
                c = a/b;
                e = ar[index];
            }
            catch(Exception exp)
            {
                expNo = array.indexOf(String.valueOf(exp.getClass()));
                switch (expNo) {
                    case 0 -> {
                        b = 2;
                        System.out.println(array.get(0) + " handled.");
                    }
                    case 1 -> {
                        index = 1;
                        System.out.println(array.get(1) + " handled.");
                    }
                    case 2 -> {
                        s = "20";
                        System.out.println(array.get(2) + " handled.");
                        flag = false;
                    }
                }//end switch
            }//end catch
        }//end while
        d = Integer.parseInt(s);

        System.out.println("After Handling Exceptions :-\nDivision : " + c);
        System.out.println("ar[index] : " + e);
        System.out.println("d = Integer.parseInt : " + d);
    }
}
