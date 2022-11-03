class problem7
{
    static int arr[] = {50,30,90};
    static int largest()
    {
        int i;
        int max = arr[0];
         
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println(largest());
        }
}