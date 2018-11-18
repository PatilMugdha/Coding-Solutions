package useCases;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (numRows == 0)
			return res;

		List<Integer> sub = new ArrayList<Integer>();
		sub.add(1);
		res.add(sub);

		int count = 1;
		while (count < numRows) {
			int j = 1;
			sub = res.get(count - 1);
			List<Integer> newSub = new ArrayList<Integer>();
			newSub.add(1);
			while (j < sub.size()) {
				newSub.add(sub.get(j - 1) + sub.get(j));
				j++;
			}
			newSub.add(1);
			res.add(newSub);
			count++;
		}

		return res;
	}
}