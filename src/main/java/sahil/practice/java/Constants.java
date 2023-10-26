package sahil.practice.java;

import java.util.HashMap;
import java.util.Map;

import sahil.practice.java.Twosum.NormalSolution;

public class Constants {

	private Map<String, Object> solutionsArr = new HashMap<>();

	public Constants() {
		super();
		solutionsArr.put("TwoSum",NormalSolution.class);
	}

	public Map<String, Object> getSolutionsArr() {
		return solutionsArr;
	}

}
