package Practice;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0, sum = 0;

        for (int n = num; n > 0; n /= 10) {
            count++;
        }

        for (int n = num; n > 0; n /= 10) {
            int digit = n % 10;
            int mul = 1;
            for (int i = 0; i < count; i++) {
                mul *= digit;
            }
            sum += mul;
        }

        System.out.println((sum == num) ? "Armstrong" : "Not Armstrong");
        scanner.close();
    }
}
