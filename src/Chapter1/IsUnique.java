package Chapter1;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public static void main(String args[]) {
        IsUnique obj = new IsUnique();
        String input = "";
        System.out.println(obj.IsUnique(input));
    }

    public boolean IsUnique(String str) {
        int n = str.length();
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for (int i = 0 ; i < n ; i ++) {
            if(mp.containsKey(str.charAt(i))) {
                return false;
            }
            else {
                mp.put(str.charAt(i) + "", 1);
            }
        }
        return true;
    }
}
