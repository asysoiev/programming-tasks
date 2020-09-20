package com.sandbox.programming;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Andrii Sysoiev
 */
public class AlgorithmsImpl implements Algorithms {
    @Override
    public String sortOddAndEvenNumbers(String src) {
        int[] arr = Arrays.stream(src.split(" "))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        sortOddAndEvenNumbers(arr);

        String result = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        return result;
    }

    private void sortOddAndEvenNumbers(int[] arr) {
        boolean sorted = false;
        int tmp;
        //even
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % 2 == 0) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] % 2 == 0) {
                            if (arr[i] < arr[j]) {
                                tmp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = tmp;
                                sorted = false;
                            }
                            break;
                        }
                    }
                }
            }
        }

        //odd
        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % 2 != 0) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] % 2 != 0) {
                            if (arr[i] > arr[j]) {
                                tmp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = tmp;
                                sorted = false;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

}
