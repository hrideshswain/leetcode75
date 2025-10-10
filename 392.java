//392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
		int i = 0;
		for (char ch : s.toCharArray()) {
			int indexOf = t.indexOf(ch, i);
			if (indexOf == -1) {
				return false;
			} else {
				i = indexOf + 1;
			}
		}
		return true;
	}
}