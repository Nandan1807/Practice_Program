import java.util.Scanner;

public class PP18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First array input
        System.out.print("Enter the size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Second array input
        System.out.print("Enter the size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merge both arrays
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // Replace duplicates with 0
        for (int i = 0; i < merged.length; i++) {
            int count = 0;
            for (int j = 0; j < merged.length; j++) {
                if (merged[i] != 0 && merged[i] == merged[j]) {
                    count++;
                }
            }

            if (count > 1) {
                int dupValue = merged[i];
                for (int j = 0; j < merged.length; j++) {
                    if (j!=i && merged[j] == dupValue) {
                        merged[j] = 0;
                    }
                }
            }
        }

        // Output the merged array
        System.out.print("Merged array: ");
        for (int val : merged) {
            System.out.print(val + " ");
        }
    }
}
