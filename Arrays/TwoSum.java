class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] nums1=new int[2];
         int k=0;
         outer:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    nums1[k]=i;
                    k++;
                    nums1[k]=j;
                    break outer;
                }
            }
        }
    return nums1;
    }
}
