import java.util.Scanner;

public class PP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n : ");

        int  n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements : ");

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int secondLargest = 0;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }

            if(arr[i] < secondSmallest && arr[i] != min){
                secondSmallest = arr[i];
            }
        }

        System.out.println("difference : "+ (secondLargest-secondSmallest));

        scanner.close();
    }
}
