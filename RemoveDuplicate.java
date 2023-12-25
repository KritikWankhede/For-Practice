import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2,4,1,2};
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        System.out.println(set.size());
    }
}
