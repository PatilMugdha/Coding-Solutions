package useCases;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		// System.out.println(input);
		// System.out.println(input.length());
		if (input.length() == 0 || input.equals(" ")) {
			System.out.println("Yes");
			return;
		}

		char tempArray[] = input.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);
		String s = mergeSort(tempArray, 0, tempArray.length - 1);
		s = s.trim();
		int j = 0, i = 0;
		for (i = 0, j = i + 1; i < s.length() - 1 && j < s.length(); i++) {
			if (s.charAt(i) == s.charAt(j)) {
				System.out.println("No");
				break;
			} else {
				j++;
			}
		}
		if (i == s.length() - 1 || j == s.length()) {
			System.out.println("Yes");
		}

		// O(n(log n)+n)=O(n)
	}

	public static String mergeSort(char[] tempArray, int low, int high) {

		int mid = (high + low) / 2;
		if (low < high) {
			mergeSort(tempArray, low, mid);
			mergeSort(tempArray, mid + 1, high);
			merge(tempArray, low, mid, high);
		}
		return new String(tempArray);
	}

	public static void merge(char[] a, int low, int mid, int high) {
		char[] b = new char[high - low + 1];
		int i = low, j = mid + 1, k = 0;
		while (i <= mid && j <= high) {
			b[k++] = a[i] <= a[j] ? a[i++] : a[j++];
		}
		while (i <= mid) {
			b[k++] = a[i++];
		}

		while (j <= high) {
			b[k++] = a[j++];
		}

		for (k = 0; k < high - low + 1; k++) {
			a[k + low] = b[k];
		}
	}
}
