package Practice;

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryString = sc.nextLine();

        int dotIndex = binaryString.indexOf('.');

        int integerPartEnd = (dotIndex != -1) ? dotIndex - 1 : binaryString.length() - 1;

        int power = 0;
        double sum = 0;
        for (int i = integerPartEnd; i >= 0; i--) {
            int binaryNum = binaryString.charAt(i) - '0';
            if (binaryNum == 1) {
                int mul = 1;
                for (int j = 0; j < power; j++) {
                    mul *= 2;
                }
                sum += mul;
            }
            power++;
        }

        if (dotIndex != -1) {
            int fracPower = 1;
            for (int i = dotIndex + 1; i < binaryString.length(); i++) {
                int binaryNum = binaryString.charAt(i) - '0';
                if (binaryNum == 1) {
                    double frac = 1;
                    for (int j = 0; j < fracPower; j++) {
                        frac /= 2;
                    }
                    sum += frac;
                }
                fracPower++;
            }
        }

        System.out.println("Decimal: " + sum);
        sc.close();
    }
}
