package Practice;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        // System.out.println(a);
        // for (int i = 1; i < num; i++) {
        //     System.out.println(b);
        //     int temp = a+b;
        //     a = b;
        //     b = temp;
        // }

        fibonacci(num, a, b);

        scanner.close();
    }

    public static void fibonacci(int num,int a,int b){
        if(num==1){
            return;
        }
        if(a==0){
            System.out.println(a);
        }
        int c = a+b;
        System.out.println(b);
        a = b;
        b = c;
        fibonacci(num-1, a, b);
    }
}
