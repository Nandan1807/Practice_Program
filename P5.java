package Practice;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            sum += num%10;
            num /= 10;
        }

        System.out.println(sum);

        int recursiveSum = sum(temp);

        System.out.println(recursiveSum);
        scanner.close();
    }

    public static int sum(int num){
        if(num==0){
            return 0;
        }
        return num%10+sum(num/10);
    }
}
