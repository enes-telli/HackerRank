import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
