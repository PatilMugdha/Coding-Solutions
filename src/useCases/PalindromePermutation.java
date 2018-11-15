package useCases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 2. Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atc o eta·; etc.)
 * 
 * 
 * */

//Backtracking
public class PalindromePermutation {
	Set<List<Character>> finalList = new HashSet<List<Character>>();

	public static void main(String[] args) {
		String s = "Tact Coa";
		s = s.toString().toLowerCase().replace(" ", "");

		char[] c = s.toCharArray();
		PalindromePermutation p = new PalindromePermutation();
		if (p.permute(p, c).size() >= 1) {
			System.out.println(p.permute(p, c).size() + " permutations");
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public Set<List<Character>> permute(PalindromePermutation p, char[] nums) {
		p.permute(finalList, nums, 0, nums.length - 1);

		for (List<Character> i : finalList) {
			for (char c : i) {
				System.out.print("" + c);
			}
			System.out.println("");
		}

		return finalList;
	}

	public void permute(Set<List<Character>> finalList, char[] nums, int l, int r) {
		if (l == r) {
			List<Character> lst = new ArrayList<Character>();
			for (char i : nums) {
				lst.add(i);
			}
			if (isPalindrome(lst, nums.length))
				finalList.add(lst);
		} else {
			for (int i = l; i <= r; i++) {
				nums = swap(nums, l, i);
				permute(finalList, nums, l + 1, r);
				nums = swap(nums, l, i);
			}
		}
	}

	private boolean isPalindrome(List<Character> lst, int length) {
		int i = 0, j = 0;
		for (i = 0, j = length - 1; i < length && j >= 0; i++, j--) {
			if (lst.get(i) != lst.get(j)) {
				break;
			}
		}
		return i == length;
	}

	public char[] swap(char[] nums, int i, int j) {
		char t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
		return nums;
	}
}
