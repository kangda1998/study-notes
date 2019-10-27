package leetcode;
import java.util.*;

/**
 * 三数和为零,且去掉数组中的重复
 */
class ThreeNumSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int k = 0 ; k < nums.length-2; k++){
            //如果k大于零，则排序之后必然大于零，break
            if(nums[k]>0) break;
            // 去掉重复数
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i = k+1;
            int j = nums.length-1;
            //双指针移动
            while(i < j){
                int sum = nums[k]+nums[i]+nums[j];
                //数值还不够
                if(sum < 0){
                    //增加
                    while( i < j && nums[i]==nums[++i]);
                }else if(sum > 0){
                    //减少
                    while(i < j && nums[j]==nums[--j]);
                }else{
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    //跳过重复数
                    while(i < j && nums[i]==nums[++i]);
                    while(i < j && nums[j]==nums[--j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num =  {-1,-1,0,1};
        ThreeNumSum threeNumSum = new ThreeNumSum();
        List<List<Integer>> lists = threeNumSum.threeSum(num);
        System.out.println(lists);
    }
}