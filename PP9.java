import java.util.Scanner;

public class PP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n =scanner.nextInt();
        if(n==0) {
            scanner.close();
            return;
        }

        fibonacci(n, 0, 1);
        scanner.close();
    }

    public static void fibonacci(int n,int a,int b){
        if(n==0) return;
        System.out.print(a+" ");
        int temp = b;
        b = a+b;
        a = temp;
        fibonacci(n-1, a, b);
    }
}
