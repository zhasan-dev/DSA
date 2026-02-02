class Solution {
    public int cons(int[] num) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
