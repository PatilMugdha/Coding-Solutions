package useCases;

import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        if(s.length()==0) return 0; 

        Set<Character> set = new HashSet<Character>(); 
        int count=0, countPrev=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                   set.add(s.charAt(j));
                }else{
                    count=set.size();
                    count=Math.max(countPrev,count);
                    countPrev=count;
                    set.clear();
                    break;
                }
        }
        }
        return countPrev;
    }  
}