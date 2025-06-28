import java.util.Scanner;

public class PP10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = scanner.nextLine();

        System.out.println("Enter character : ");

        char c = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);

            if(c == element){
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
