package Practice;

import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        String octalString = decimalToOctal(n);
        System.out.println(octalString);

        double decimal = octalToDecimal(octalString); // FIXED: pass String not double!
        System.out.println(decimal);

        scanner.close();
    }

    public static String decimalToOctal(double n){
        String ans = "";
        int intPart = (int)n;

        // Integer part
        for (int i = intPart; i > 0; i /= 8) {
            ans = (i % 8) + ans;
        }

        // Fractional part
        double fracPart = n % 1;
        if(fracPart != 0){
            ans += ".";
            for (int i = 0; i < 3; i++) {
                fracPart *= 8;
                int digit = (int)fracPart;
                ans += digit;
                fracPart -= digit;
            }
        }

        return ans;
    }

    public static double octalToDecimal(String octalStr){
        String[] parts = octalStr.split("\\.");
        String intPart = parts[0];
        String fracPart = parts.length > 1 ? parts[1] : "";

        double res = 0;

        // Integer part
        int power = 1;
        for (int i = intPart.length() - 1; i >= 0; i--) {
            int digit = intPart.charAt(i) - '0';
            int mul = 1;
            for (int j = 1; j < power; j++) {
                mul *= 8;
            }
            res += digit * mul;
            power++;
        }

        // Fractional part
        for (int i = 0; i < fracPart.length(); i++) {
            int digit = fracPart.charAt(i) - '0';
            double div = 1.0;
            for (int j = 0; j < i + 1; j++) {
                div /= 8;
            }
            res += digit * div;
        }

        return res;
    }
}
