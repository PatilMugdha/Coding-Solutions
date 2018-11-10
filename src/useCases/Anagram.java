package useCases;

import java.util.HashMap;

class Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        int i=0;
        if(s.length()!=t.length()){
            return false;
        }
        for(i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))!=null){
                int count=hm.get(s.charAt(i));
                count++;
                hm.put(s.charAt(i),count);  
            }else{
               hm.put(s.charAt(i),1);  
            }       
        }
        
        for(i=0;i<t.length();i++){
            if(hm.get(t.charAt(i))==null || hm.get(t.charAt(i))<=0) return false;
            int count=hm.get(t.charAt(i));
            count--;
            hm.put(t.charAt(i),count);
        } 
        return true;
    }
}
