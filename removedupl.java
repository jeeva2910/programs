public class removedupl {
    
    public int removeDuplicates(int[] nums){
        int rd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd=rd+1;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
    }
        public static void main(String args[]){
            int nums[]={1,1,2};
            removedupl obj=new removedupl();
            int result=obj.removeDuplicates(nums);
            System.out.println(result);
        }
        
    }
   
