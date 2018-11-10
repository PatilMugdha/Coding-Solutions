package useCases;

class IsPalindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i=0,j=s.length()-1;
        while(i<s.length() && j>=0){
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            } 
             i++;
             j--;
       }
        return true;
    }
}
