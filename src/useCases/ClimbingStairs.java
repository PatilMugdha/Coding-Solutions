package useCases;

public class ClimbingStairs {

	public static void main(String[] args) {
		ClimbingStairs cs=new ClimbingStairs();
		System.out.println(cs.climbStairs(44));
	}
	
	    public int climbStairs(int n) {

	        int[] mem = new int[100];
	        for(int i=0;i<n;i++){
	            mem[i]=0;
	        }
	        return climb(n, mem);
	    }
	    
	    public int climb(int n, int[] mem){
	        
	        int sum=0;
	        if(n==1) return 1;
	        if(n==2) return 2;
	        if(n>2){
	             if(mem[n]!=0){
	                return mem[n]; 
	             } 
	             mem[n]=climb(n-1,mem)+climb(n-2,mem);
	        }
	        return mem[n];
	    }
	

}
