import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, max = 0;
        while(n > 0) {
            if(n % 2 == 1) {
                if(++sum > max)
                    max = sum;
            } else {
                sum = 0;
            }
            n >>= 1;
        }
        System.out.println(max);
    }
}
