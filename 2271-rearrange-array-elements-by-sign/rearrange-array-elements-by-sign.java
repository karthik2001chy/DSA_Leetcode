class Solution {
    public int[] rearrangeArray(int[] nums) {
       int pl=nums.length/2;
       int nl=nums.length/2;
       int n=nums.length;
       int p[]=new int[pl];
       int ne[]=new int [nl];
       int pp=0;
       int nn=0;
       for(int i=0;i<n;i++){
           if(nums[i]>0){
               p[pp]=nums[i];
               pp++;
           }
           else{
               ne[nn]=nums[i];
               nn++;

           }

       } 
       int i = 0, j = 0, k = 0;
        while (i < pl && j < nl) {
            nums[k++] = p[i++];
            nums[k++] = ne[j++];
        }
        return nums;

    }
}