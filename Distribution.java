class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       int sum=0;
       for (int a : apple) {
            sum += a;
        }
        Arrays.sort(capacity);
        int m = capacity.length;
        int count = 0;
        int currentCapacity = 0;
    
        for (int i = m - 1; i >= 0; i--) {
            currentCapacity += capacity[i];
            count++;
            if (currentCapacity >= sum) {
                break;
            }
        }
         return count;
    }
}

