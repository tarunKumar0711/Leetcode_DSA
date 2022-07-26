class ExamRoom {
    ArrayList<Integer> lst;
    int n;
    public ExamRoom(int n) {
        lst = new ArrayList<>();
        this.n=n;
    }
    
    public int seat(){
        
        if(lst.size()==0)
        {
            lst.add(0);
            return 0;
        }
        
        
        int distance = Math.max(lst.get(0),n-1-lst.get(lst.size()-1));
        
        for(int i=0;i<lst.size()-1;i++)
            distance=Math.max(distance,(lst.get(i+1)-lst.get(i))/2);
        
        
        if(lst.get(0)==distance)
        {
            lst.add(0,0);
            return 0;
        }
        
        for(int i=0;i<lst.size()-1;i++)
        {   
            int currDistance=(lst.get(i+1)-lst.get(i))/2;
             if(currDistance==distance)
             {
                 lst.add(i+1,(lst.get(i+1)+lst.get(i))/2);
                 return lst.get(i+1);
             }
         }
        
        
        lst.add(n-1);
        return n-1;
    }
    
    public void leave(int p) {
        for(int i=0;i<lst.size();i++)
        {
            if(lst.get(i)==p)
                lst.remove(i);        
        }
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */