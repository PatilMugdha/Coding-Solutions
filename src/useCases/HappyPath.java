package useCases;

public class HappyPath {

	public static void main(String[] args) {
		System.out.println(isHappy(2));
		System.out.println(isHappy(19));
	}
	
    public static boolean isHappy(int n) {
        int sum=0,q=0;
        while(sum!=1){
            while(n!=0){
                q=n%10;
                n=n/10;
                sum+=q*q;
                
            }
            if(sum>1 && sum!=4){
               n=sum; 
               sum=0; 
            } 
            else{
                break;
            }
        }
        if(sum==1) return true;
        return false;
    }

}
