import java.util.Scanner;

public class PP15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit : ");

        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements : ");

        a[0] = scanner.nextInt();
        // sorting on time of insertion (insertion sort)
        for (int i = 1; i < a.length; i++) {
            int key  = scanner.nextInt();
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        int actualCount = 1;
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i+1] - a[i] == 1){
                count++;
            }else{
                count = 1;
            }

            if(actualCount < count){
                actualCount = count;
            }
        }

        System.out.println(actualCount);

        scanner.close();
    }
}
