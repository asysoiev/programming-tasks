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

        sortOddAndEvenNumbersSingleWhile(arr);

        String result = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        return result;
    }

    private void sortOddAndEvenNumbersSingleWhile(int[] arr) {
        int tmp;
        boolean sorted = false;
        while (!sorted) {
            System.out.println("while");
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("forI");
                if (arr[i] % 2 == 0) {
                    //search next even item
                    for (int j = i + 1; j < arr.length; j++) {
                        System.out.println("forJ");
                        if (arr[j] % 2 == 0) {
                            //compare, swap
                            if (arr[i] < arr[j]) {
                                tmp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = tmp;
                                sorted = false;
                            }
                            break;
                        }
                    }
                } else {
                    //search next odd item
                    for (int j = i + 1; j < arr.length; j++) {
                        System.out.println("forJ");
                        if (arr[j] % 2 != 0) {
                            //compare, swap
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
