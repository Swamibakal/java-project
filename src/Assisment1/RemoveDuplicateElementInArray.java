package Assisment1;

import java.util.HashSet;

public class RemoveDuplicateElementInArray {
	public static void main(String[] args) {
int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        for (int element : arr) {
            uniqueSet.add(element);
        }
        
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        
        for (int element : uniqueSet) {
            uniqueArray[index] = element;
            index++;
        }
        
        // Print the unique elements
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
    }

}

		