import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int sum = 0, max = 0;
        while(n > 0)
        {
            if(n % 2 == 1) {
                if(++sum > max)
                    max = sum;
            } else {
                sum = 0;
            }
            n >>= 1;
        }
        scanner.close();
        System.out.println(max);
    }
}
