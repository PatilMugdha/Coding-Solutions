package useCases;

/*
 * 3. There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
 * 
 * */
public class EditDistanceOne {
	public static void main(String[] args) {
		String a = "pale";
		String b = "ple";

		boolean result = editDistanceOne(b, a);
		System.out.println(a + "," + b + "->" + result);
	}

	private static boolean editDistanceOne(String a, String b) {
		int i = 0, j = 0;
		int[][] T = new int[a.length() + 1][b.length() + 1];

		for (i = 0; i < T[0].length; i++) {
			T[0][i] = i;
		}

		for (i = 0; i < T.length; i++) {
			T[i][0] = i;
		}

		for (i = 1; i <= a.length(); i++) {
			for (j = 1; j <= b.length(); j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					T[i][j] = T[i - 1][j - 1];
				} else {
					T[i][j] = Math.min(Math.min(T[i - 1][j - 1], T[i - 1][j]), T[i][j - 1]) + 1;
				}
			}
		}

		for (i = 0; i <= a.length(); i++) {
			for (j = 0; j <= b.length(); j++) {
				System.out.print(T[i][j] + " ");
			}
			System.out.println("\n");
		}

		return countEdits(T, a, b) == 1;
	}

	private static int countEdits(int[][] T, String a, String b) {
		int i = T.length - 1;
		int j = T[0].length - 1;
		int count = 0;
		while (true) {
			if (i == 0 || j == 0)
				break;
			if (a.charAt(i - 1) == b.charAt(j - 1)) {
				i--;
				j--;
			} else if (T[i][j] == T[i - 1][j] + 1) {
				count++;
				i--;
			} else if (T[i][j] == T[i][j - 1] + 1) {
				count++;
				j--;
			} else if (T[i][j] == T[i - 1][j - 1] + 1) {
				count++;
				i--;
				j--;
			}
		}
		return count;
	}
}
