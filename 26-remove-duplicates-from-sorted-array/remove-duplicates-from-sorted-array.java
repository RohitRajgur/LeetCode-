class Solution {
    public int removeDuplicates(int[] nums) {
        
        int min=0;
        int unique=1;
        int max=1;

        while(max<nums.length)
        {
            if(nums[min]!=nums[max]){
                min++;
                nums[min]=nums[max];
                unique++;
            }
            max++;
        }
        return unique;
    }
}