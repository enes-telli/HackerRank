import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), number;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (number < 2) {
                result[i] = "Not prime";
            } else {
                int length = (int) Math.sqrt(number);
                for (int j = 2; j <= length; j++) {
                    if (number % j == 0) {
                        result[i] = "Not prime";
                        break;
                    }
                }
                if (result[i] == null) {
                    result[i] = "Prime";
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
