package datastruct;

/**
 * 208. 实现 Trie (前缀树)
 *
 * @author baijiahui
 * @date 2021/4/14
 */
public class lc208 {


    static private class Trie{

        static private class Node{
            public boolean val;
            public Node[] next = new Node[26];

            public Node(boolean val){
                this.val = val;
            }
        }

        private Node root;
        /** Initialize your data structure here. */
        public Trie() {
            this.root = new Node(false);
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            char[] cs = word.toCharArray();
            Node node = this.root;
            for (char c: cs){
                if (node.next[c - 'a'] == null)
                    node.next[c - 'a'] = new Node(false);
                node = node.next[c - 'a'];
            }
            node.val = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            char[] cs = word.toCharArray();
            Node node = this.root;
            for (char c: cs){
                if (node.next[c - 'a'] == null){
                    return false;
                }
                node = node.next[c - 'a'];
            }
            return node.val;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            char[] cs = prefix.toCharArray();
            Node node = this.root;
            for (char c: cs){
                if (node.next[c - 'a'] == null){
                    return false;
                }
                node = node.next[c - 'a'];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("hello");
        System.out.println(t.search("ell"));
    }
}


