package Practice;

import java.util.Scanner;

public class P22 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // char c = 'A';
        // int num = 1;

        // for (int i = 0; i < n; i++) {
        //     for (int k = 0; k < n-i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         if(i%2==0){
        //             System.out.print(" "+num+" ");
        //             num++;
        //         }
        //         else{
        //             System.out.print(" "+c+" ");
        //             c++;
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        //         for (int k = 0; k < i; k++) {
        //             System.out.print(" ");
        //         }
        //         for (int j = 0; j < (n-i)*2-1; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }
    

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n * 2 - 1; j++) {
        //         if (j < n - i) {
        //             System.out.print("*");
        //         } else if (j >= n - i - 1 && j < n + i - 1) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        int x = 1;
        char c;
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < (n*2) - x + 1; j++) {
                System.out.print(" ");
            }
            c = 'A';
            for (int j = 0; j < x; j++) {
                System.out.print(c+" ");
                if(j<(x/2)){
                    c++;
                }else{
                    c--;
                }
            }
            if(i<n-1){
                x+=2;
            }
            else{
                x-=2;
            }
            System.out.println();
        }
        scanner.close();
    }
}
