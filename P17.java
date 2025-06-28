package Practice;

public class P17 {
    public static void main(String[] args) {
        int arr[] = {12,3,22,1,2,53,4};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
