//Practical Assignment – Collection – count of elements
//
//Write a method that takes an array of elements as input and returns a Map
// where the keys are the elements themselves, and the values represent how many times each element occurs.

import java.util.*;

public class CountElements {

    // Method to count elements
    public static Map<Integer, Integer> countElements(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }

        }

        return map;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 1, 4, 2};

        Map<Integer, Integer> result = countElements(numbers);

        System.out.println(result);
    }
}