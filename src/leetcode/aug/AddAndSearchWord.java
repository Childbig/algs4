package leetcode.aug;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-08-05 19:24
 * @modified By：
 * @Description：
 *
 *
 *  Design a data structure that supports the following two operations:
 *
 * void addWord(word)
 * bool search(word)
 *
 * search(word) can search a literal word or a regular expression
 * string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * Example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class AddAndSearchWord {

    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */

     static class WordDictionary {

        class TrieNode
        {
            private TrieNode[] children;
            public boolean hasWord;

            // Initialize your data structure here.
            public TrieNode()
            {
                children = new TrieNode[26];
                hasWord = false;
            }

            public void insert(String word, int index)
            {
                if (index == word.length())
                {
                    this.hasWord = true;
                    return;
                }

                int pos = word.charAt(index) - 'a';
                if (children[pos] == null)
                {
                    children[pos] = new TrieNode();
                }
                children[pos].insert(word, index + 1);
            }

            public boolean find(String word, int index)
            {
                if (index == word.length())
                {
                    return this.hasWord;
                }
                if (word.charAt(index) == '.')
                {
                    boolean res = false;
                    for (int i=0;i<children.length && !res;i++)
                    {
                        if (children[i] != null)
                        {
                            res = children[i].find(word, index + 1);
                        }
                    }
                    return res;
                }
                else
                {
                    int pos = word.charAt(index) - 'a';
                    return children[pos] == null ? false : children[pos].find(word, index + 1);
                }
            }
        }

         private TrieNode root;

         WordDictionary()
         {
             root = new TrieNode();
         }

         // Adds a word into the data structure.
         public void addWord(String word) {
             root.insert(word,0);
         }

         // Returns if the word is in the data structure. A word could
         // contain the dot character '.' to represent any one letter.
         public boolean search(String word) {
             return root.find(word, 0);
         }
    }

    public static void main(String[] args) {

          WordDictionary obj = new WordDictionary();
          obj.addWord("123");
          boolean param_2 = obj.search("123");
        System.out.println(param_2);
    }
}
