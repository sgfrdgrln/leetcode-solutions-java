import java.util.*;

// Two Sum

public class TwoSumSolution {

    public static void main(String[] args) {

        int[] numsArray = {2,7,9,5,2};

        int[] nums = twoSum(numsArray, 9);

        System.out.println("["+nums[0] + "," + nums[1]+"]");
        
    }

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            Integer complementsIndex = complements.get(nums[i]);

            if(complementsIndex != null) {

                return new int[]{complementsIndex, i};

            }
            complements.put(target - nums[i], i);

        }
        
        return nums;

    }

}