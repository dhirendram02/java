public class problem16 {
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("first number");
        int x = in.nextInt();  
		System.out.print("second number");
		int y = in.nextInt(); 
		System.out.print("third number");
        int z = in.nextInt(); 
        System.out.print("result is: "+sumoftwo(x, y, z));
		System.out.print("\n");
    }
    
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
}
