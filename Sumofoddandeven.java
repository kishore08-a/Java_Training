public class Sumofoddandeven{
    public static void main(String[] args) {
        int eve=0;
        int od=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                eve+=i;
            }
            else{
                od+=i;
            }
        System.out.println("Even sum: " + eve);
        System.out.println("Odd sum: " + od);
        }
    }
    
}