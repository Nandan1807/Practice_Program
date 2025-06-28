package Practice;

import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}