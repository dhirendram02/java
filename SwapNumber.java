class SwapNumber   
{  
    public static void main(String a[])   
    {   
        int x = 40 ; 
        int y = 30;
        
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  