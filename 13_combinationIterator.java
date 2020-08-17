class CombinationIterator {
    
    int[] arr;
    boolean last = false;
    String s;
    
    public CombinationIterator(String characters, int combinationLength) {
        arr = new int[combinationLength];
        s = characters;
        
        for (int i = 0; i < arr.length; i++) 
            arr[i] = i;    
    
    }
    
    private void generateCombinations()
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[arr.length - 1 - i] < s.length() - 1 - i) 
            {
                arr[arr.length - 1 - i]++;
                
                for (int j = arr.length - 1 - i + 1; j < arr.length; j++) 
                {
                    arr[j] = arr[j - 1] + 1;
                }
                return;
            }
        }
        
        last = true;
    }
    
    public String next() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) 
            sb.append(s.charAt(arr[i]));
        
        generateCombinations();
        
        return sb.toString();
    }
    
    public boolean hasNext() {
        return !last;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */