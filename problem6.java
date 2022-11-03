public class problem6 {
    public static void main(String[] args) {
      int[] arr = {5,1,1,6,4,9,3};
      int key = 7;
      for (int i : arr) {
          if (i==key){
           System.out.println("present");
           break;
           }
          else{
           System.out.println("not present");
           break;
           }
      }    
    }
  }
  