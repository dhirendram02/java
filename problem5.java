import java.util.*;
 
class problem5{
    static void swapvalues(int m, int n)
    {
        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println("m = " + m +","+ "n = " + n);
    }
    public static void main(String[] args)
    {
        int m = 9, n = 5;
        swapvalues(m, n);
    }
}