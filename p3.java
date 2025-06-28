// Two strings S and T are called simqual if all occurrences of each character in S can be replaced with another character to get T and vice-versa. So there should exist a unique mapping between all characters from S and all characters from T such that replacing all characters from S, represent T, with the mapped characters results into T, resp. S. Note that mapping a
// character to itself is allowed but no two characters may be replaced by the same character.
// Examples:
// - The strings "ACAB" and "XCXY". They are simqual we can map 'A' to 'X', 'B' to 'Y' and 'C' to 'C'.
// - The strings "ACAB" and "XCXC". They are not simqual both ‘C’ and ‘B’ should map to ‘C’.
// - The strings "ACAB" and "XCCY". They are not simqual ‘A’ should map to both ‘X’ and ‘C’.
// - The strings "ACAB" and "XCX". They are not simqual they don’t have the same number of characters.
 
import java.util.HashMap;

public class p3 {
    public static void main(String[] args) {
        String s = "ACAB";
        String t = "XXCY";
        int n = s.length();
        int m = t.length();
        if(n != m) {
            System.out.println("not simqual");
            return;
        }

        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2){
                    System.out.println("not simqual");
                    return;
                }
            }else{
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2)){
                if(map2.get(c2) != c1){
                    System.out.println("not simqual");
                    return;
                }
            }else{
                map2.put(c2,c1);
            }
        }

        System.out.println("simqual");
    }
}
