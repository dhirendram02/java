class search {
    public static void main(String[] args){
        int[] arr = {5,4,2,9,8,7,2};
        int key = 7;
        for (int i = 0; i < arr.length; i++ ){
            if(i==key){
                System.out.println("present");
                break;
            }
        }
    }
}