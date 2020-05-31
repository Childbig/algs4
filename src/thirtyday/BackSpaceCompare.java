package thirtyday;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-05-22 18:29
 * @modified By：
 * @Description： Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 *
 *
 */
public class BackSpaceCompare {

    public boolean backspaceCompare(String S, String T) {

        if (S.length() != T.length()) {
            return  false;
        }

        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();



        S.indexOf("#");
        for (char c : charS) {
            if (c == '#') {

            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("a##c".indexOf("#"));
    }
}
