package useCases;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j=1;
        int n=nums.length;
        while(i<n-1 && j<n){  
            if(nums[i]==0 && nums[j]!=0){
                swap(i,j,nums);
                i++; j=i+1;
            }else{
                j++;
            }
            if(j==n){
                i++; j=i+1;
            }
        }
    }
    
    public void swap(int i, int j, int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;        
    }
}
