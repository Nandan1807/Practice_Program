import java.util.Scanner;

public class PP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter s1 : ");

        String s1 = scanner.nextLine();

        System.out.println("Enter s2 : ");

        String s2 = scanner.nextLine();
        int m = s1.length();
        int n = s2.length();

        if(m != n) {
            System.out.println(false);
            scanner.close();
            return;
        }

        for (int i = 0; i < m; i++) {
            char key = s1.charAt(i);
            int c1 = 0;
            int c2 = 0;

            for (int j = 0; j < m; j++) {
                if(s1.charAt(j)==key){
                    c1++;
                }
            }

            for (int j = 0; j < n; j++) {
                if(s2.charAt(j)==key){
                    c2++;
                }
            }

            if(c1 != c2){
                System.out.println(false);
                scanner.close();
                return;
            }
        }
        System.out.println(true);
        scanner.close();
    }
}
