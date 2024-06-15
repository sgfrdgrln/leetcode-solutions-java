import java.util.*;

// Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

public class SortColorsSolution {
    
    public static void main(String[] args) {

        int[] colors = {1,2,0,1,2,2,0,0};

        System.out.println("Unsorted colors: ");

        for(int i = 0; i < colors.length; i++) {

            
            if(i == 0) {
                System.out.print("[");
            }

            if(i < colors.length - 1) {
                System.out.print(colors[i] + ",");
            }else {
                System.out.print(colors[i] +"]");
            }

        }

       sortColors(colors);
        
    }

    public static void sortColors(int[] nums) {

        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end) {

            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    start++;
                    mid++;
                    break;
            
                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
        System.out.println("\nSorted colors: ");
        for(int i = 0; i < nums.length; i++) {
      
            if(i == 0) {
                System.out.print("[");
            }

            if(i < nums.length - 1) {
                System.out.print(nums[i] + ",");
            }else {
                System.out.print(nums[i] +"]");
            }
          
        } 
    

    }
    public static void swap(int[] arr, int pos1, int pos2) {
        
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        
    }

}



