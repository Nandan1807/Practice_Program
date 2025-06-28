import java.util.Scanner;

public class PP12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = scanner.nextLine();

        int top = 0;
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '{' || c == '(' || c == '[') {
                arr[top] = c;
                top++;
            } else if (c == '}' || c == ')' || c == ']') {
                if (top == 0) {
                    System.out.println(false);
                    scanner.close();
                    return;
                }
                top--; 
                char element = arr[top];

                if ((c == '}' && element != '{') ||
                    (c == ')' && element != '(') ||
                    (c == ']' && element != '[')) {
                    System.out.println(false);
                    scanner.close();
                    return;
                }
            }
        }

        if (top != 0) {
            System.out.println(false);
            scanner.close();
            return;
        }

        System.out.println(true);
        scanner.close();
    }
}
