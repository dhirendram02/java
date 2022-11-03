public class Main3 {
    public static void main(String[] args) {
    // Using loop through array
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
      }

    //Loop through array For Each
    String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : car) {
        System.out.println(i);
        }
    //Multi-dimensionals Array
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = myNumbers[1][2];
    System.out.println(x);

    //convert string lowercase to uppercase
    String str2 = "This is TutorialsPoint";
    System.out.println("string value = " + str2.toUpperCase());
    }
}
  