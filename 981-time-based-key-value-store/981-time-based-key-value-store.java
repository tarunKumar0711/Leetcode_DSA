class TimeMap {
    Map<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> tM = map.get(key);
        
        if(tM==null)
            return "";
        Integer fKey = tM.floorKey(timestamp);
        
        if(fKey==null)
            return "";
        return tM.get(fKey);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */