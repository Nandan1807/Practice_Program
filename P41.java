package Practice;

import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        boolean isNegative = (num < 0) ? true : false;
        int arr[] = new int[Integer.toString(Math.abs(num)).length()];
        num = Math.abs(num);
        int ind = 0;
        for (int i = num; i > 0; i /= 10) {
            arr[ind] = i % 10;
            ind++;
        }

        for (int i = 0; i < arr.length; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (isNegative) {
                    if (arr[index] < arr[j]) {
                        index = j;
                    }
                } else {
                    if (arr[index] > arr[j]) {
                        index = j;
                    }
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        if (!isNegative) {
            int firstNonzero = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    firstNonzero = i;
                    break;
                }
            }

            if (firstNonzero > 0) {
                int temp = arr[0];
                arr[0] = arr[firstNonzero];
                arr[firstNonzero] = temp;
            }
        }

        if(isNegative) System.out.print("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        scanner.close();
    }
}
