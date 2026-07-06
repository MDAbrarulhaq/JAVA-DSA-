public class notmincount {
    public int countNonMinimum(int[] nums) {
      
        int min = nums[0];
int minCount = 1;

for (int i = 1; i < nums.length; i++) {
    if (nums[i] < min) {
        min = nums[i];
        minCount = 1;
    } else if (nums[i] == min) {
        minCount++;
    }
}

return nums.length - minCount;
        
    }
}
public static void main(String[] args) {
    notmincount solution = new notmincount();
    int[] nums = {3, 1, 2, 1, 4};
    int result = solution.countNonMinimum(nums);
    System.out.println("Count of non-minimum elements: " + result);
}