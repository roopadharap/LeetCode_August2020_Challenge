class WordDictionary {
    private TrieNode root;
    
    class TrieNode
    {
        TrieNode [] tList;
        boolean isEndWord;
        
        TrieNode()
        {
            tList = new TrieNode[26];
            isEndWord = false;
        }
    }

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if(word == null)
            return;
        
        TrieNode node = root;
        
        for(int i=0; i<word.length(); i++)
        {
            char c = word.charAt(i);
            if(node.tList[c-'a'] == null)
                node.tList[c-'a'] = new TrieNode();
            
            node = node.tList[c-'a'];
        }
        
        node.isEndWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word, 0, root);
    }
    
    private boolean search(String word, int index, TrieNode node)
    {
        if(node == null)
            return false;
        
        if(index == word.length())
            return node.isEndWord;
        
        char c = word.charAt(index);
        
        if(c == '.')
        {
            for(TrieNode tItem : node.tList)
            {
                if(search(word, index+1, tItem))
                    return true;
            }
        }
        else
        {
            if(search(word, index+1, node.tList[c-'a']))
                return true;
        }
        
        return false;
    }
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */