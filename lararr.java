public class lararr{
    public static void main(String[] args) {
        int arr[] = {52,85,84,16,84};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array is: "+max);
    }
}