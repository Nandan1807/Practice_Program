package Practice;

import java.util.Scanner;

public class P44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a octal number : ");
        int n = scanner.nextInt();

        String binaryString = "";
        for (int i = n; i > 0 ; i /= 10) {
            int digit  = i % 10;
            String dString = "";
            for (int j = digit; j > 0; j /= 2) {
                dString = j % 2  + dString;
            }
            String zeroString = "";
            for (int j = 0; j < 3 - dString.length(); j++) {
                zeroString += '0';
            }
            binaryString  = zeroString + dString + binaryString;
        }

        String hexaString = "";
        int k = binaryString.length();
        while (k >= 0) {
            String digitString = binaryString.substring(k-4>=0?k-4:0, k);
            String zeroString = "";
            for (int j = 0; j < 4 - digitString.length(); j++) {
                zeroString += '0';
            }
            digitString = zeroString + digitString;
            int decimal = 0;
            int power = 0;
            for (int i = digitString.length() - 1; i >= 0; i--) {
                if(digitString.charAt(i) == '1'){
                    int ans = 1;
                    for (int j = 0; j < power; j++) {
                        ans *= 2;
                    }
                    decimal += ans;

                }

                power++;
            }
            if(decimal >= 10){
                hexaString  = (char)('A'+decimal-10) + hexaString;
            }else{
                hexaString = decimal + hexaString;
            }
            k -= 4;
        }

        System.out.println(hexaString);
        scanner.close();
    }
}
