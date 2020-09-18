import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }
}
