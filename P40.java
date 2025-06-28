package Practice;

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit for array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                if(counter==1) {
                    System.out.println(false);
                    return;
                }
                if(i==0 || arr[i-1] <= arr[i+1]){
                    arr[i] = arr[i+1];
                }
                else{
                    arr[i+1] = arr[i];
                }
                counter++;
            }
        }
        System.out.println(true);
        scanner.close();
    }
}
