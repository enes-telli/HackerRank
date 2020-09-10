import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        String[] outputs = {"", ""};
        
        for(int i = 0; i < n; i++)
        {
            words[i] = sc.next();
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                outputs[j % 2 == 0 ? 0 : 1] += words[i].charAt(j);
            }
            System.out.println(outputs[0] + " " + outputs[1]);
            outputs[0] = outputs[1] = "";
        }
    }
}
