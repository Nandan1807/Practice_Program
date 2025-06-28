package Practice;

import java.util.ArrayList;
import java.util.List;

public class P19 {
    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};

        List<Float>[] buckeLists = new ArrayList[arr.length];

        for (int i = 0; i < buckeLists.length; i++) {
            buckeLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int buckeIndex = (int)(arr[i]*arr.length);
            buckeLists[buckeIndex].add(arr[i]);
        }

        for (int i = 0; i < buckeLists.length; i++) {
            insertionSort(buckeLists[i]);
        }


        int ind = 0;
        for (int i = 0; i < buckeLists.length; i++) {
            for (int j = 0; j < buckeLists[i].size(); j++) {
                arr[ind] = buckeLists[i].get(j);
                ind++;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }

    public static void insertionSort(List<Float> bucket){
        for (int i = 0; i < bucket.size(); i++) {
            float key = bucket.get(i);
            int j = i-1;

            while (j>=0 && bucket.get(j) > key) {
                bucket.set(j+1, bucket.get(j)) ;
                j--;
            }
            bucket.set(j+1, key);
        }
    }
}
