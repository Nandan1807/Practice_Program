import java.util.Arrays;
import java.util.Scanner;

public class PP8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n : ");

        int  n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp; 
        }

        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
