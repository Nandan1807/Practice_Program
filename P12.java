package Practice;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0, min = Integer.MAX_VALUE, sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();

            if(val > max){
                max = val;
            }

            if(val < min){
                min = val;
            }

            sum += val;
            count++;
        }
        System.out.println("Maximum value : "+max);
        System.out.println("Minimum value : "+min);
        System.out.println("Sum value : "+sum);
        System.out.printf("Average value : %.2f\n", (double)sum / count);
        scanner.close();
    }
}
