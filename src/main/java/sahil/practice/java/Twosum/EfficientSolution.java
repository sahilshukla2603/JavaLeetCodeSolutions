package sahil.practice.java.Twosum;

import java.util.HashMap;
import java.util.Map;

public class EfficientSolution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> values = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int lookingFor = target - current;
            if(values.containsKey(lookingFor)){
                int fst = values.get(lookingFor);
                return new int[]{fst,i};
            }else{
                values.put(current,i);
            }
        }
        return new int[2];
	}
}
