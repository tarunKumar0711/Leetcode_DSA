class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s:strs){
            char ch[] =  s.toCharArray();
            Arrays.sort(ch);
            String sS = new String(ch);
            map.putIfAbsent(sS, new ArrayList<String>());
            map.get(sS).add(s);
            
        }
        
        return new ArrayList(map.values());
        
    }
}
//In Java, List is an interface. That is, it cannot be instantiated directly.

//Instead you can use ArrayList which is an implementation of that interface that uses an array as its backing store (hence the name).