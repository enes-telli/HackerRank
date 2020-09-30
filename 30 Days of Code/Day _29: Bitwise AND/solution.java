import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int max = 0;
            
            for(int j = 1; j < n1; j++) {
                for(int k = j + 1; k <= n1; k++) {
                    if((j & k) > max && (j & k) < n2) {
                        max = j & k;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
