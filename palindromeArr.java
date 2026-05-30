import java.util.Arrays;
public class palindromeArr{
    public static void main(String[] args) {
        int arr[]={2,2,2};
        int n= 3;
        int temp[]=arr.clone();
        int start=0;
        int end=n-1;
        while(start<end){
            int a =temp[start];
            temp[start]=temp[end];
            temp[end] = a;
            start++;
            end--;
        }
        if(Arrays.equals(temp, arr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
