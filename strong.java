public class strong {
    public static void main(String[] args) {
        int num = 145, sum = 0, temp;
        temp = num;
        while (temp != 0) {
            int a = temp % 10;
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num)
            System.out.println( "is an Armstrong number.");
        else
            System.out.println( " is not an Armstrong number.");
    }
}