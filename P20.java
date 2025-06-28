package Practice;

import java.util.Scanner;


public class P20 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
    
        int res = 1;

        for (int i = 0; i < b; i++) {
            int ans = 0;
            for (int j = 0; j < a; j++) {
                ans += res;
            }
            res = ans;
        }

        System.out.println(res);
        scanner.close();
    }
}
