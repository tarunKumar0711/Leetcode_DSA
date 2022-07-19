class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (String a, String b) -> a.length()==b.length()?b.compareTo(a):b.length()-a.length());
        
        // if (a.length() == b.length()) {
        //         return b.compareTo(b);
        //     }
        //     return b.length() - a.length();
        // });
        
        return nums[k-1];
        
    }
}