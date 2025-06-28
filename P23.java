package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[6];
        int currentSize = 0;
        while (true) {
            if(currentSize == arr.length){
                System.out.println("Array is full.");
                break;
            }

            System.out.println("Enter Element : ");
            int inp = scanner.nextInt();
            if(inp == -1){
                break;
            }

            System.out.println("Enter Index to insert the element(from 0 to "+ currentSize +") : ");
            int index = scanner.nextInt();
            if(index < 0 || index>currentSize){
                System.out.println("Entered index is out of range.");
                break;
            }
            for (int i = arr.length-1 ; i > index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = inp;
            currentSize++;
            System.out.println(Arrays.toString(arr));
        }
        scanner.close();
    }
}
