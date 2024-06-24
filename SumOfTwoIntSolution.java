public class SumOfTwoIntSolution {
    
    public static void main(String[] args) {

        int num = getSum(10, 5);

        System.out.println(num);

    }
    public static int getSum(int a, int b) {
        
        while(b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }

        return a;
    }
}
