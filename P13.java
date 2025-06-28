package Practice;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows for matrix a");
        int m = scanner.nextInt();
        System.out.println("Enter number of columns for matrix a");
        int n = scanner.nextInt();
        System.out.println("Enter number of rows for matrix b");
        int p = scanner.nextInt();
        if(p!=n){
            System.out.println("number of rows for matrix b should be equal to number of columns for matrix a");
            scanner.close();
            return;
        }
        System.out.println("Enter number of columns for matrix b");
        int q = scanner.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[p][q];
        int c[][] = new int[m][q];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.println(i + " " + j + " : " + c[i][j]);
            }
        }
        scanner.close();
    }
}
