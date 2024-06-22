import java.util.*;

public class FizzBuzzSolution {

// Fizz Buzz

    public static void main(String[] args) {

       List<String> myList = fizzBuzz(50);

        System.out.println(myList.toString());
    }

    public static List fizzBuzz(int n) {

        List<String> words = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            if((i % 3 == 0) && (i % 5 == 0)) {
                words.add("FizzBuzz");
            }else if(i % 3 == 0) {
                words.add("Fizz");
            }else if(i % 5 == 0) {
                words.add("Buzz");
            }else {
                words.add(String.valueOf(i));
            }

        }

        return words;

    }

}