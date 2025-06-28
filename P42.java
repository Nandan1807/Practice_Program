package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit for input : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements for array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter size of window : ");
        int k = scanner.nextInt();
        if(k>n || k<=0) {
            System.out.println("Invalid size");
            scanner.close();
            return;
        }

        int ans[] = new int[n-k+1];

        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = arr[i];
            for (int j = i; j < i+k; j++) {
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            ans[i] = max;
        }

        System.out.println(Arrays.toString(ans));
        scanner.close();
    }
}
