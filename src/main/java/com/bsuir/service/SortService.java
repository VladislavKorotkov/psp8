package com.bsuir.service;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SortService {
    public static int[] sortNumbers(String numbs, String sortOrder) {

        String[] numberStrings = numbs.split(", ");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        if (sortOrder.equals("asc")) {
            Arrays.sort(numbers);
        } else if (sortOrder.equals("desc")) {
            Arrays.sort(numbers);
            ArrayUtils.reverse(numbers);
        }

        return numbers;
    }
}
