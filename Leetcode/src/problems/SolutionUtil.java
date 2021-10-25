package problems;

public class SolutionUtil {

    private SolutionUtil() {

    }

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order. https://leetcode.com/problems/two-sum/
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1 ; j > i ; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }
        return result;
    }

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {
            Character firstChars = s.charAt(0);
            StringBuilder subString = new StringBuilder(firstChars.toString());
            int result = 1;
            for (int i = 1; i < s.length(); i++) {
                String nextElement = ((Character)s.charAt(i)).toString();
                if (!subString.toString().contains(nextElement)) {
                    subString.append(s.charAt(i));
                    if (result < subString.length()) {
                        result = subString.length();
                    }

                } else {
                    if (result < subString.length()) {
                        result = subString.length();
                    }
                    subString = new StringBuilder(subString.substring(subString.indexOf(nextElement) + 1));
                    subString.append(nextElement);
                }
            }
            return result;
        }
    }
}
