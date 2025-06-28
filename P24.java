package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,3,121,34,1112,5};
        int currentSize = arr.length;
        System.out.println(Arrays.toString(arr));
        while (true) {
            if(currentSize == 0){
                System.out.println("Array is empty.");
                break;
            }
            System.out.println("Enter element to delete.(-1 to end)");
            int inp = sc.nextInt();
            if(inp == -1){
                break;
            }
            boolean flag = false;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if(inp == arr[i]){
                    flag = true;
                    index = i;
                }
            }
            if(flag==false){
                System.out.println("Element is not found");
                break;
            }else{
                for (int i = index; i < arr.length-1; i++) {
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = 0;
                currentSize--;
            }
            System.out.println(Arrays.toString(arr));

        }

        sc.close();
    }
}
