package thirtyday;

import java.util.*;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-05-08 10:44
 * @modified By：
 * @Description： Given an array of strings, group anagrams together.
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {


    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            } else {
                ans.get(key).add(s);
            }

        }


        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] TEST = {"eat", "tea", "tan", "ate", "nat", "bat"};

        groupAnagrams(TEST);
    }
}
