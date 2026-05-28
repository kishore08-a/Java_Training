import java.util.Arrays;
public class Lastzero{
    public static void main(String[] args){
        int arr[] ={651,0,0,848,84,168,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.print(Arrays.toString(arr));
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
}