package Practice;

public class P16 {
    public static void main(String[] args) {
        int arr[] = {12,3,22,1,2,53,4};


        for (int i = 0; i < arr.length-1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag == 0){
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
