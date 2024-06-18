class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        String longSub="";
        for(int i=0; i<s.length();i++){
            String sub= "";
            for (int j=i; j<s.length(); j++){
                
                if(sub.indexOf(s.charAt(j))==-1){
                    sub= sub+ s.charAt(j);
                    if (sub.length() > longSub.length()) {
                        longSub = sub;
                    }
                }
                else{
                    break;
                }
            }
        }
        return longSub.length();
    }
}