import java.util.Scanner;
import java.util.HashMap;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            map.put(name, phone);
        }
        
        while (sc.hasNext()) {
            String s = sc.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
