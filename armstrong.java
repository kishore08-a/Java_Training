public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int count = 0; 
        int temp=n;
        int sum=0;
        while(temp!=0){
            count++;
            temp%=10;

        }
        temp = n;
        while(temp!=0){
            int a = temp%10;
            sum = Math.pow(a,count);
            temp/=10;

        }
        if (sum == n)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
        
    }
}