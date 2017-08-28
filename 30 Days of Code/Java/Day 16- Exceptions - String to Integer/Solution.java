import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i ;
        String str=scan.next();
        try
        {
           i=Integer.parseInt(str);
           System.out.print(i);
        }
        catch (NumberFormatException e)
        {
            System.out.print("Bad String");
        }

    }
}
