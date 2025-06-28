package Practice;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        int evenDigit = 0;
        int oddDigit = 0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num>0) {
            int digit = num%10;
            if(digit%2 == 0){
                evenDigit++;
            }else{
                oddDigit++;
            }
            num /= 10;
        }

        System.out.println(evenDigit+" "+oddDigit);

        sc.close();
    }
}
