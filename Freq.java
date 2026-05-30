
import java.util.Scanner;

public class Freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());

            boolean [] b = new boolean[n];
        for(int i = 0;i<n;i++){
            if( b [i]){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println("count"+count);
        }
    }
}
