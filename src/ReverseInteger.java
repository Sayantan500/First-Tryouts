import java.io.IOException;
import java.util.Scanner;
class ReverseInteger
{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int n = scan.nextInt();
        System.out.println("The Reverse of the Integer is : " + reverse(n));
    }

    public static int reverse(int x)
    {
        int rev = 0;

        while(x!=0)
        {
            if(rev>Integer.MAX_VALUE/10)
                return 0;

            if(rev<Integer.MIN_VALUE/10)
                return 0;

            else
            {
                rev = rev*10 + x%10;
                x=x/10;
            }
        }
        return rev;
    }
}