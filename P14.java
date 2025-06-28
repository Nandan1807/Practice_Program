package Practice;

import java.util.Scanner;


public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hours");
        int hours = scanner.nextInt();
        System.out.println("Enter Minutes");
        int minutes = scanner.nextInt();

        double hourangle = (double)((hours + (double)minutes/60) * 360)/12;
        double minuteangle = (double)(minutes *360)/60;
        double diff = Math.abs(hourangle-minuteangle);
        System.out.println("angle between hours and minutes are : "+(diff > 180?360-diff:diff));

        scanner.close();
    }
}
