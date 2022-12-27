public class problem11{
  public static void main(String[] args)
  {
      int n = 9;
      for (int a = 0; a <= n; a++) {
          for (int b = 1; b <= n - a; b++) {
              System.out.print(" ");
          }
          for (int l = 0; l <= a; l++) {
              System.out.print("*");
          }
          System.out.println("");
      }
  }
}