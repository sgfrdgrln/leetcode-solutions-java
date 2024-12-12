import java.util.*;

public class PlusOneSolution {
 public static void main(String[] args) {
    
    int num[] = {1,2,3};
    int num2[] = {1,2,4};
    int num3[] = {9,9,9};
    
    int newNum[] = plusOne(num);
    int newNum2[] = plusOne(num2);
    int newNum3[] = plusOne(num3);

    System.out.println(Arrays.toString(newNum));
    System.out.println(Arrays.toString(newNum2));
    System.out.println(Arrays.toString(newNum3));

 }
 public static int[] plusOne(int[] digits) {

    for(int i = digits.length - 1; i >= 0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int newDigits[] = new int[digits.length + 1];
        newDigits[0] = 1;
     return newDigits;
}
}