package Practice;

import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter decimal number");
        int decimal = scanner.nextInt();
        int count = Integer.toString(decimal).length();

        int bcd[][] = new int[count][4];

        for (int i = decimal; i > 0; i /= 10) {
            int digit = i % 10;

            int index = 3;

            for (int j = digit; j > 0; j /= 2) {
                bcd[count - 1][index] = j % 2;
                index--;
            }
            count--;
        }

        System.out.print(" Bcd : ");
        for (int i = 0; i < bcd.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(bcd[i][j]);
            }
             System.out.print("  ");
        }

        scanner.close();
    }
}
