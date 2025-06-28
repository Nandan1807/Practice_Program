import java.util.Scanner;

public class PP7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n =scanner.nextInt();
        if(n==0) {
            scanner.close();
            return;
        }

        int a = 0;
        int b = 1;
        String ansString = "";

        for (int i = 1; i <= n; i++) {
            ansString = a + " " + ansString;
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(ansString);

        scanner.close();
    }
}
