import java.util.Arrays;
import java.util.Scanner;

public class PP13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit : ");

        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter limit : ");

        int m = scanner.nextInt();
        int[] b = new int[m];

        System.out.println("Enter Elements : ");

        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[m+n];
        c[0] = a[0];

        //intertion sort direct use kari sakie.
        for (int i = 1; i < c.length; i++) {
            int key;
            int j = i - 1;

            if(i < a.length){
                key = a[i];
            }else{
                key = b[i - a.length];
            }

            while (j >= 0 && c[j] > key) {
                c[j+1] = c[j];
                j--;
            }
            c[j+1] = key;
        }

        System.out.println(Arrays.toString(c));

        scanner.close();
    }
}
