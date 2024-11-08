package leetcode;

public class MaximumWealth {

    private static int maximumWealth(int[][] accounts) {
        int maxWeightSoFar = 0;

        for (int[] customer: accounts) {
            int currentCustomerWealth = 0;
            for (int bank: customer) {
                currentCustomerWealth += bank;

                maxWeightSoFar = Math.max(maxWeightSoFar, currentCustomerWealth);
            }
        }
        return maxWeightSoFar;
    }
}
