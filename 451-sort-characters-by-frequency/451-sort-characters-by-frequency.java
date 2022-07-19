class Solution {
    class Pair{
        char ch;
        int n;
        public Pair(char ch , int n){
            this.ch = ch;
            this.n = n;
        }
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++)
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.n-a.n);
        
        for(Map.Entry<Character,Integer> mapEle: map.entrySet())
        {
            char key = mapEle.getKey();
            int value = mapEle.getValue();
            pq.offer(new Pair(key,value));
        }
        String ans="";
        
        while(pq.size()>0)
        {
            Pair p = pq.poll();
            char c = p.ch;
            int q = p.n;
            while(q-->0)
                ans+=c;
        }
        
        return ans;
    }
}