public class ReverseIntegerSolution {
 
    // Reverse Integer

    public static void main(String[] args) {

       
        System.out.println(reverse(321));
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(Integer.MIN_VALUE));

    }

    public static int reverse(int x) {
        
        long reversed = 0;
        int temp;
        
        while(x != 0) {
            
            temp = x % 10;
            reversed = reversed * 10 + temp;
            x /= 10;
            
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            
        }
        return (int) reversed;
    }
}