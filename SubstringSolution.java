import java.util.*;


public class SubstringSolution {

    public static void main(String[] args) {

        int length = lengthOfLongestSubstring("abcde");

        System.out.println(length);
        
    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for(int right = 0, left = 0; right < s.length(); right++) {

            int indexOfFirstAppearanceSubstring = s.indexOf(s.charAt(right), left);

            if(indexOfFirstAppearanceSubstring != right) {

                left = indexOfFirstAppearanceSubstring + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;

    }
}