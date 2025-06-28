package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,3,121,34,1112,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element to search.");
        int inp = sc.nextInt();

        int ans  = isInArray(arr, inp);

        if(ans==1){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        sc.close();
    }

    public static int isInArray(int a[],int m){
        if (a.length == 0) {
            return 0;
        }
        else if(a[0] == m){
            return 1;
        }
        else{
            // return isInArray(Arrays.copyOfRange(a, 1, a.length), m);
            int arr[] = new int[a.length-1];
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[index] = a[i];
                index++;
            }
            return isInArray(arr, m);
        }
    }
}
