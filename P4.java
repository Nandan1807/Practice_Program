package Practice;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factIter = 1;

        for (int i = 2; i <= num; i++) {
            factIter *= i;
        }
        System.out.println(factIter);

        int recursivefact = fact(num);

        System.out.println(recursivefact);
        scanner.close();
    }

    public static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
