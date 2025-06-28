package Practice;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        //iterative
        for (int i = 1; i <= num/2; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
        System.out.println(num);

        //recursive

        factor(num,1);
        

        scanner.close();
    }
    public static void factor(int num,int i){
            if (i==num/2){
                if(num%i==0){
                    System.out.println(i);
                }
                System.out.println(num);
                return;
            }
            if(num%i==0){
                System.out.println(i);
            }
            factor(num, i+1);
    }
}
