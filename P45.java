package Practice;

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String finalString = "";
        String[] parts = n.split("\\.");
        String intPart = parts[0];
        String fracPart = parts.length > 1 ? parts[1] : "";

        finalString += octalConvert(intPart, false) + '.';
        
        finalString += fracPart.length() > 0 ? octalConvert(fracPart, true) : "";

        System.out.println(finalString);

        scanner.close();
    }

    public static String octalConvert(String n, boolean flag) {
        String binaryString = "";

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int digit = 0;
            if (c >= 'A' && c <= 'F') {
                digit = 10 + c - 'A';
            } else {
                digit = c - '0';
            }
            String dString = "";
            for (int j = digit; j > 0; j /= 2) {
                dString = j % 2 + dString;
            }

            String zeroString = "";

            for (int j = 0; j < 4 - dString.length(); j++) {
                zeroString += '0';
            }
            binaryString += zeroString + dString;
        }

        String octalString = "";
        int k = flag ==  true ? 0 : binaryString.length();
        if(flag){
            while (k < binaryString.length()) {
                String subBinary = binaryString.substring(k , k+3 < binaryString.length() ? k+3 : binaryString.length());
                String zeroString = "";
    
                for (int j = 0; j < 3 - subBinary.length(); j++) {
                    zeroString += '0';
                }
    
                subBinary =  subBinary + zeroString;
                int decimal = 0;
                int power = 0;
    
                for (int i = subBinary.length() - 1; i >= 0; i--) {
                    if (subBinary.charAt(i) == '1') {
                        int ans = 1;
                        for (int j = 0; j < power; j++) {
                            ans *= 2;
                        }
                        decimal += ans;
                    }
                    power++;
                }
                octalString = octalString + decimal;
                k += 3;
            }
        }
        else{
            while (k >= 0) {
                String subBinary = binaryString.substring(k - 3 >= 0 ? k - 3 : 0, k);
                String zeroString = "";
    
                for (int j = 0; j < 3 - subBinary.length(); j++) {
                    zeroString += '0';
                }
    
                subBinary = zeroString + subBinary;
                int decimal = 0;
                int power = 0;
    
                for (int i = subBinary.length() - 1; i >= 0; i--) {
                    if (subBinary.charAt(i) == '1') {
                        int ans = 1;
                        for (int j = 0; j < power; j++) {
                            ans *= 2;
                        }
                        decimal += ans;
                    }
                    power++;
                }
                octalString = decimal + octalString;
                k -= 3;
            }
        }
        
        octalString = octalString.replaceFirst("^0+(?!$)", "");

        return octalString;
    }
}
