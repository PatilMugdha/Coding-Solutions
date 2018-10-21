package useCases;

public class FindDuplicate {

	public static void main(String[] args) {
		//Input: [1,3,4,2,2]
		//Output: 2
		int[] arr = new int[] {1,3,4,2,2};
		System.out.println(findDuplicate(arr));

	}

	public static int findDuplicate(int[] a) {
		int i = 0, k = 1, n = a.length;
		int find = 0;
		while (i + k != n) {
			if (a[i] != a[i + k]) {
				k++;
			} else {
				find = a[i + k];
				break;
			}
			if (k + i == n) {
				i++;
				k = 1;
			}
		}
		return find;
	}

}
