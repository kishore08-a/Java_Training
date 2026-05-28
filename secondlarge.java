public class secondlarge {
    public static void main(String[] args) {
        int arr[] = {52,85,84,16,84};
        int max = 0;
        int secondmax = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: "+secondmax);
    }
}