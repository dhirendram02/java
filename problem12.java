class problem12 {
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {4,9,6,0,5,7};
        int n = arr.length;
         
        int x = 0;
        int index = search(arr, n, x);
        if (index == -1)
            System.out.println(" not present ");
        else
            System.out.println("element found  " + index);
    }
}