public class Main2 {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "amount", "world"};
      for (String i : cars) {
        System.out.println(i);
      }    
    //using of break in loop
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          break;
        }
        System.out.println(i);
      }
    //using of continue in loop
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          continue;
        }
        System.out.print( i );
      }
    //Break example using in JAVA
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }
    //Access the Elements of an Array
    String[] var = {"mohit", "xyz", "white", "cricket"};
    System.out.println(var[0]);

    //change an array element
    String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
    car[0] = "suzuki";
    System.out.println(car[0]);


    }
}