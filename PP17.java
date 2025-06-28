import java.util.Arrays;
import java.util.Scanner;

public class PP17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit : ");

        int n = scanner.nextInt();
        String[] a = new String[n];

        System.out.println("Enter Elements : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLine();
        }

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        scanner.close();
    }
}
