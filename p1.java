// You are given an array of integers nums.
// A "dominant number" is defined as an integer that appears in the array with a frequency strictly greater than the total unique numbers in the array.
// Return all dominant numbers in the array in ascending sorted order
 
// Input nums = [1, 2, 3, 1, 1, 4, 5, 1, 1, 1] Output [1] Explanation · There are 5 unique numbers in the array: 1, 2, 3, 4, and 5. · The number 1 appears 6 times, which is strictly greater than 5 (the total unique numbers). · No other number appears more than 5 times. Therefore, only 1 is a dominant number.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class p1 {
    public static void main(String []args){

        int[] arr = {10,10,10,10,20,20,20,20,30};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int size = map.size();

        List<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            if(map.get(i) > size){
                list.add(i);
            }
        }

        list.sort(null);
        System.out.println(list);

    }
}