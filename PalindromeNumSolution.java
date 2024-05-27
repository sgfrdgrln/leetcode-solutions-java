public class PalindromeNumSolution {

    // Palindrome Number
    
    public static void main(String[] args) {
        

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));

    }
    public static boolean isPalindrome(int x) {

        // Early return for negative numbers and numbers that end in 0 but are not 0
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            
             // Reverse half of the number
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        // Check if the number is a palindrome
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
