package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementsWithDuplicates {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        int[] commonElements = findCommonElements(A, B);

        System.out.println("Common elements with duplicates: " + java.util.Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] A, int[] B) {
        Map<Integer, Integer> countMapA = new HashMap<>();
        Map<Integer, Integer> countMapB = new HashMap<>();

        // Count occurrences of elements in array A
        for (int num : A) {
            countMapA.put(num, countMapA.getOrDefault(num, 0) + 1);
        }

        // Count occurrences of elements in array B
        for (int num : B) {
            countMapB.put(num, countMapB.getOrDefault(num, 0) + 1);
        }

        List<Integer> commonElementsList = new ArrayList<>();

        // Iterate through the elements in array A
        for (int num : A) {
            if (countMapA.containsKey(num) && countMapB.containsKey(num)) {
                int minCount = Math.min(countMapA.get(num), countMapB.get(num));
                for (int i = 0; i < minCount; i++) {
                    commonElementsList.add(num);
                }
                countMapA.remove(num);
                countMapB.remove(num);
            }
        }

        // Convert the list to an array
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElementsArray[i] = commonElementsList.get(i);
        }

        return commonElementsArray;
    }
}
