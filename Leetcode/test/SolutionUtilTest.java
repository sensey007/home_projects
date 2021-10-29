import org.junit.jupiter.api.Test;
import problems.SolutionUtil;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionUtilTest {

    @Test
    void testTwoSum() {
        // Example 1
        int [] expectedResultExample1 = {0,1};
        int [] dataExample1 = {2,7,11,15};
        int [] actualResultExample1 = SolutionUtil.twoSum(dataExample1, 9);
        assertArrayEquals(expectedResultExample1, actualResultExample1);

        // Example 2
        int [] expectedResultExample2 = {1,2};
        int [] dataExample2 = {3,2,4};
        int [] actualResultExample2 = SolutionUtil.twoSum(dataExample2, 6);
        assertArrayEquals(expectedResultExample2, actualResultExample2);

        // Example 3
        int [] expectedResultExample3 = {0,1};
        int [] dataExample3 = {3,3};
        int [] actualResultExample3 = SolutionUtil.twoSum(dataExample3, 6);
        assertArrayEquals(expectedResultExample3, actualResultExample3);
    }

    @Test
    void testLengthOfLongestSubstring() {
        // Example 1
        int expectedResultExample1 = 3;
        String dataExample1 = "abcabcbb";
        int actualResultExample1 = SolutionUtil.lengthOfLongestSubstring(dataExample1);
        assertEquals(expectedResultExample1, actualResultExample1);

        // Example 2
        int expectedResultExample2 = 1;
        String dataExample2 = "bbbbb";
        int actualResultExample2 = SolutionUtil.lengthOfLongestSubstring(dataExample2);
        assertEquals(expectedResultExample2, actualResultExample2);

        // Example 3
        int expectedResultExample3 = 3;
        String dataExample3 = "pwwkew";
        int actualResultExample3 = SolutionUtil.lengthOfLongestSubstring(dataExample3);
        assertEquals(expectedResultExample3, actualResultExample3);

        // Example 4
        int expectedResultExample4 = 0;
        String dataExample4 = "";
        int actualResultExample4 = SolutionUtil.lengthOfLongestSubstring(dataExample4);
        assertEquals(expectedResultExample4, actualResultExample4);
    }

    @Test
    void testLongestPalindrome() {
        // Example 1
        String expectedResultExample1 = "bab";
        String dataExample1 = "babad";
        String actualResultExample1 = SolutionUtil.longestPalindrome(dataExample1);
        assertEquals(expectedResultExample1, actualResultExample1);

        // Example 2
        String expectedResultExample2 = "bb";
        String dataExample2 = "cbbd";
        String actualResultExample2 = SolutionUtil.longestPalindrome(dataExample2);
        assertEquals(expectedResultExample2, actualResultExample2);

        // Example 3
        String expectedResultExample3 = "aaaa";
        String dataExample3 = "aaaa";
        String actualResultExample3 = SolutionUtil.longestPalindrome(dataExample3);
        assertEquals(expectedResultExample3, actualResultExample3);

        // Example 4
        String expectedResultExample4 = "aca";
        String dataExample4 = "aacabdkacaa";
        String actualResultExample4 = SolutionUtil.longestPalindrome(dataExample4);
        assertEquals(expectedResultExample4, actualResultExample4);

    }

    @Test
    void testMaxArea() {
        // Example 1
        int expectedResultExample1 = 49;
        int [] dataExample1 = {1,8,6,2,5,4,8,3,7};
        int actualResultExample1 = SolutionUtil.maxArea(dataExample1);
        assertEquals(expectedResultExample1, actualResultExample1);

        // Example 2
        int expectedResultExample2 = 1;
        int [] dataExample2 = {1,1};
        int actualResultExample2 = SolutionUtil.maxArea(dataExample2);
        assertEquals(expectedResultExample2, actualResultExample2);

        // Example 3
        int expectedResultExample3 = 16;
        int [] dataExample3 = {4,3,2,1,4};
        int actualResultExample3 = SolutionUtil.maxArea(dataExample3);
        assertEquals(expectedResultExample3, actualResultExample3);

        // Example 4
        int expectedResultExample4 = 1;
        int [] dataExample4 = {1,2};
        int actualResultExample4 = SolutionUtil.maxArea(dataExample4);
        assertEquals(expectedResultExample4, actualResultExample4);

        // Example 5
        int expectedResultExample5 = 24;
        int [] dataExample5 = {1,2,3,4,5,25,24,3,4};
        int actualResultExample5 = SolutionUtil.maxArea(dataExample5);
        assertEquals(expectedResultExample5, actualResultExample5);
    }
}
