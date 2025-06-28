package Practice;

public class P18 {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 22, 1, 2, 53, 4 };

        for (int i = 0; i < arr.length; i++) {
            int ind = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[ind] > arr[j]) {
                    ind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
