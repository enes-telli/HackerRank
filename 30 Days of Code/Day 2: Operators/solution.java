import java.util.Scanner;

public class Solution {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println(Math.round(meal_cost + meal_cost * (tip_percent + tax_percent) / 100 ));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        solve(meal_cost, tip_percent, tax_percent);
    }
}
