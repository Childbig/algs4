package thirtyday;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-01 07:50
 * @modified By：
 * @Description：
 */
public class Construct {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[128];
        magazine.chars().forEach(c -> counts[c]++);
        return ransomNote.chars().allMatch(c -> counts[c]-- > 0);
    }


    public static void main(String[] args) {
        String ransomNode = "aa";
        String magazine = "aab";

        canConstruct(ransomNode, magazine);
    }
}
