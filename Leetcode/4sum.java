import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        Long tgt = (long) target;
        for(int i=0; i<=num.length-3; i++){
            if(i>0 && num[i]==num[i-1]) continue;
            for(int j=i+1; j<=num.length-2; j++){
                if(j>i+1 && num[j]==num[j-1]) continue;
                int left = j+1;
                int right = num.length-1;
                while (left < right){
                    long sum = (long) num[i] + num[j] + num[left] + num[right];
                    if(sum == tgt){
                        result.add(Arrays.asList(num[i],num[j], num[left], num[right]));
                        while(left < right && num[left] == num[left+1]) left++;
                        while(left < right && num[right] == num[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(sum>tgt){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return result;
    }
}