package thirtyday.june;

public class isSubsequence {


    public static boolean isSubsequence(String s, String t) {
        boolean flag = true;
        int start = 0;
        while (flag) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    if (i == s.length() - 1) {
                        flag = false;
                    }
                    continue;
                } else {
                    start += i;
                    break;
                }
            }
        }
        return flag;
    }


    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        isSubsequence(s, t);
    }
}
