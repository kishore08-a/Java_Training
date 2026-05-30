import java.util.*;

public class Flames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String name1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter Second Name: ");
        String name2 = sc.nextLine().toLowerCase().replace(" ", "");

        StringBuilder n1 = new StringBuilder(name1);
        StringBuilder n2 = new StringBuilder(name2);

        // Remove common letters
        for (int i = 0; i < n1.length(); i++) {
            char ch = n1.charAt(i);

            int index = n2.indexOf(String.valueOf(ch));

            if (index != -1) {
                n1.deleteCharAt(i);
                n2.deleteCharAt(index);
                i--;
            }
        }

        int count = n1.length() + n2.length();

        String flames = "FLAMES";
        int pos = 0;

        while (flames.length() > 1) {
            pos = (pos + count - 1) % flames.length();
            flames = flames.substring(0, pos) + flames.substring(pos + 1);

            if (pos == flames.length()) {
                pos = 0;
            }
        }

        char result = flames.charAt(0);

        switch (result) {
            case 'F':
                System.out.println("Result: Friends");
                break;
            case 'L':
                System.out.println("Result: Lovers");
                break;
            case 'A':
                System.out.println("Result: Affection");
                break;
            case 'M':
                System.out.println("Result: Marriage");
                break;
            case 'E':
                System.out.println("Result: Enemies");
                break;
            case 'S':
                System.out.println("Result: Siblings");
                break;
        }

        sc.close();
    }
}