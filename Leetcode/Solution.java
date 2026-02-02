public class Solution {
    public <List<List<Integer>> threesum(int [] sum){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(sum);
        for(int i =0; i<=sum.length-3; i++){
            if(i ==0 || sum[i]!=sum[i-1]){
                int left = i+1;
                int right = sum.length-1;
                while(left<right){
                    int sum1 = num[i]+num[left]+num[right];
                    if(sum1 == 0){
                        result.add(Arrays.asList(num[i], num[left], num[right]));
                        while(left<right && num[left]==num[left+1]) left++;
                        while(left<right && num[right]==num[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(sum1<0) left++;
                    else right--;
                }
                       
            }
            return result;
        }
    }
}
