package geekster;

public class Find_missing_minimum {

	public static void main(String []args) {
		int arr[]= {2,3,6,7,8,9,10};
		Find_missing_minimum ob=new Find_missing_minimum();
		System.out.println(ob.firstMissingPositive(arr));
	}
	 public int firstMissingPositive(int[] nums) {
	        sort(nums);
	        
	        int i=0;
	        
	        for(i=0;i<nums.length;i++){
	            if(nums[i]!=i+1)
	                return i+1;
	        }
	        return i+1;
	    }
	    
	    private void sort(int[] nums){
	        
	        int i=0;
	       
	        
	        while(i<nums.length){
	             int correct=nums[i]-1;
	            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
	                swap(nums,i,correct);
	                
	            }
	            else
	                i++;
	        }
	}
	    
	    void swap(int[] nums,int i,int correct){
	        int temp=nums[i];
	        nums[i]=nums[correct];
	        nums[correct]=temp;
	    }
	
}
