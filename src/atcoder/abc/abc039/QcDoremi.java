package atcoder.abc.abc039;

import java.util.HashMap;
import java.util.Scanner;

public class QcDoremi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = s.substring(0, 12);
        HashMap<Integer, String> ans = new HashMap<>();
        ans.put(1, "Do");
        ans.put(11, "Re");
        ans.put(9, "Mi");
        ans.put(8, "Fa");
        ans.put(6, "So");
        ans.put(4, "La");
        ans.put(2, "Si");
        String se = "BWBWWBWBWB";
        System.out.println(ans.get((ss + ss).indexOf(se) % 12));
    }
}
