package Practice;

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        if(n < 2) {
            System.out.println(n);
            scanner.close();
            return;
        }
        int left = 0, right = n,ans = 0;

        while (left<=right) {
            int mid = left + (right - left) / 2;

            long square = mid * mid;

            if(square == n){
                ans = mid;
                break;
            }else if(square < n){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(ans);

        scanner.close();
    }
}
