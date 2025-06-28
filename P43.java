package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit for input : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements for array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter value of k : ");
        int k = scanner.nextInt();
        int count = 0;
        //solution 1 (o(n2))
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j]==k){
        //             count++;
        //         }
        //     }
        // }

        //solution 2 (o(n))
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = k - num;
            if (map.containsKey(complement)) {
                count += map.get(complement); 
            }
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }
        System.out.println(count);
        scanner.close();
    }
}
