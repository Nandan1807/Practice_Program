import java.util.Scanner;

public class PP14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = scanner.nextLine();

        String revString = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                revString = c + revString;
            }

        }

        String ans = "";
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                ans += revString.charAt(x);
                x++;
            }else{
                ans += c;
            }
        }

        System.out.println(ans);

        scanner.close();
    }
}
