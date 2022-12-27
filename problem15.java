public class problem15 {

    public static void main(String[] args) {
     int arr[] = new int[]{55,32,45,98,82,11,9,39,50};
     int smal = arr[0];
     int lar = arr[0];
   
     for (int i = 1; i < arr.length; i++) {
      if (arr[i] > lar)
       lar = arr[i];
      else if (arr[i] < smal)
       smal = arr[i];
     }
   
     System.out.println(" " + lar);
     System.out.println(" " + smal);
    }
}