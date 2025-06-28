import java.util.Scanner;

public class PP3 {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n : ");

        int  n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == (n/2) || j == (n/2) ){
                    System.out.print("* ");
                }else if(j == 0 && i < (n/2) ){
                    System.out.print("* ");
                }else if(j == n-1 && i > (n/2) ){
                    System.out.print("* ");
                }else if(j < (n/2) && i == n-1 ){
                    System.out.print("* ");
                }else if(j > (n/2) && i == 0 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
