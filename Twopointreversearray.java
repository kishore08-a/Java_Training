import java.util.Arrays;
public class Twopointreversearray{
    public static void main(String[] args){
        int arr[]={28,489,34,468,87};
        int n=5;
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}