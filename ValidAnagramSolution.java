public class ValidAnagramSolution {

    // Valid Anagram

    public static void main(String[] args) {

        boolean validator = isAnagram("listen", "silent");

        System.out.println(validator);
        
    }
    public static boolean isAnagram(String s, String t) {

        
        int[] char_count = new int[26];
        
        if(s.length() != t.length()) {
            return false;
        }
            for(int i = 0; i < s.length(); i++) {
                char_count[s.charAt(i) - 'a']++;
                char_count[t.charAt(i) - 'a']--;
            }
            for(int count : char_count) {
                if(count != 0) {
                    return false;
                }
            }
        
        return true;

    }
}
