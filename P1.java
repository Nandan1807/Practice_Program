package Practice;

import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}