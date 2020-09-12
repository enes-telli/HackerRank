import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N < 6)
                System.out.println("Not Weird");
            else if(N < 21)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }
}
