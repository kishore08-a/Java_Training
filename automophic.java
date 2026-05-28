public class automophic {
    public static void main(String[] args) {
        int n = 25;
        int temp = n;
        int sq = n*n;
        while(temp!=0){
            if(temp%10 != sq%10){
                System.out.println("Not automorphic");
                return;
            }

            temp /= 10;
            sq /= 10;
        }
      System.out.println("morphic");

    }
}