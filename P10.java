package Practice;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 2; j <= i/2 ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Prime number : "+i);
            }
        }

        scanner.close();
    }
}
