import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String email = sc.next();
            if(email.matches(".+@gmail\\.com")) {
                names.add(name);
            }
        }
        
        Collections.sort(names);
        
        for(String name : names) {
            System.out.println(name);
        }
    }
}
