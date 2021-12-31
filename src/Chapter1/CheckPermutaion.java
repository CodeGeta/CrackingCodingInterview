package Chapter1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutaion {


    public static void main(String[] args) {
        CheckPermutaion obj = new CheckPermutaion();
        String inputA = "aaaaas";
        String inputB = "saaaaaa";
        System.out.println(obj.checkPermutationWithSorting(inputA, inputB));
    }

    public boolean checkPermutationWithHashMap(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();

        Map<String, Integer> mp = new HashMap<>();


        for(int i = 0 ; i < n1 ; i++) {
            if(mp.containsKey(a.charAt(i))) {
                mp.put(a.charAt(i) + "", 1);
            }
            else {
                int count = mp.get(a.charAt(i) + "");
                mp.put(a.charAt(i) + "", count + 1);
            }
        }

        for(int i = 0 ; i < n2 ; i++) {
            if(mp.containsKey(b.charAt(i))) {
                int count = mp.get(b.charAt(i) + "");
                if(count == 1) {
                    mp.remove(b.charAt(i) + "");
                }
                else {
                    mp.put(b.charAt(i) + "", count - 1);
                }
            }
            else {
                return false;
            }
        }
        return true;
    }


    public boolean checkPermutationWithSorting(String a, String b) {
        char[] ach = a.toCharArray();
        Arrays.sort(ach);
        a = new String(ach);

        char[] bch = b.toCharArray();
        Arrays.sort(bch);
        b = new String(bch);

        if(a.equals(b)) {
            return true;
        }
        else {
            return false;
        }
    }
}
