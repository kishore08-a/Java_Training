public class amicable{
    public static void main(String[] args){
        int a=220; 
        int b=284; 
        int sumA=0; 
        int sumB=0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                sumA+=i;
            }
        }
        for(int i=1; i<a;i++){
            if(b%i==0){
                sumB+=i;
            }
        }
        if(sumA==sumB){
            System.out.println("Amicable numbers");     
        }
        else{
            System.out.println("Not Amicable numbers");
        }
    }
}