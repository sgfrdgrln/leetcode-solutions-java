import java.util.*;

// Roman to Integer

public class RomanToIntegerSolution {

    public static void main(String[] args) {
        
        int result = romanToInt("MMXXIV");

        System.out.println(result);

    }
    
    public static int convertToInteger(char c) {
        
        switch(c) {
                
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
            
        }
        
        
    }
    
    public static int romanToInt(String s) {
        
        int sum = 0;
        int current = convertToInteger(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            int next = convertToInteger(s.charAt(i));
            
            if(current < next) {
                sum -= current;
            }
            else {
                sum += current;
            }
             current = next;
            
        }
        sum += current;
        
        return sum;
        
    }
}