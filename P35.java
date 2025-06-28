package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements in a : ");
        int n = scanner.nextInt();
        System.out.println("Enter elements of a : ");
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }

        HashMap<Integer,Integer> hashB = new HashMap<>();
        System.out.println("Enter number of elements in b : ");
        int m = scanner.nextInt();
        System.out.println("Enter elements of b : ");
        int b[] = new int[m];
        for (int i = 0; i < m ; i++) {
            b[i] = scanner.nextInt();
            hashB.put(b[i], hashB.getOrDefault(b[i], 0)+1);
        }


        System.out.println("Intersect Elements : ");
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(hashB.containsKey(a[i]) && hashB.get(a[i])>0){
                arr.add(a[i]);
                hashB.put(a[i], hashB.get(a[i])-1);
            }
        }


        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j  = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
        }

        

        System.out.println("Intersection result : "+arr);
        scanner.close();
        
    }
}
