import java.util.Scanner;

public class PP16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit : ");

        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter target : ");

        int t = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == t){
                    System.out.println(i+" "+j);
                    System.out.println(true);
                    scanner.close();
                    return;
                }
            }
        }
        System.out.println(false);

        scanner.close();
    }
}
