public class Main1 {
    public static void main(String[] args) {
      //Widening casting
      int MYInt = 9;
      double MYDouble = MYInt; 
  
      System.out.println(MYInt);      
      System.out.println(MYDouble); 

      //Narrowing casting
      double myDouble = 9.78d;
      int myInt = (int) myDouble; 
      System.out.println(myDouble);   
      System.out.println(myInt);  

      //operators
      int sum1 = 100 + 50;
      int sum2 = sum1 + 250;     
      int sum3 = sum2 + sum2;
      System.out.println(sum1);  
      System.out.println(sum2);  
      System.out.println(sum3);  

    }
  }