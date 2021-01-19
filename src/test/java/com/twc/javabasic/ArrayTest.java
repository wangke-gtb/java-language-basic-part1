package com.twc.javabasic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {
    @Test
    void should_resize_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = null;

        // TODO: Please allocate a new array whose length is 10 and copy the
        //   original array into the new array. You should not use `for` or
        //   other kind of loops explicitly.
        // <--start
        newArray = Arrays.copyOf(originalArray, 10);
        // -end->

        assertArrayEquals(
                new int[] {1, 2, 3, 4, 5, 0, 0, 0, 0, 0},
                newArray
        );
    }

    @Test
    void should_slice_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] first2Elements = null;
        int[] last3Elements = null;

        // TODO: Please slice the original array into two array objects. You should
        //   not use `for` or other kind of loop explicitly.
        // <--start
        first2Elements = Arrays.copyOfRange(originalArray, 0, 2);
        last3Elements = Arrays.copyOfRange(originalArray, 2, 5);
        // -end->

        assertArrayEquals(new int[] {1, 2}, first2Elements);
        assertArrayEquals(new int[] {3, 4, 5}, last3Elements);
    }

    @Test
    void should_iterate_over_an_array() {
        int[] originalArray = {1, 2, 3, 4, 5};
        String destination = null;

        // TODO: Please iterate over an array and turn each element into its string
        //   representation. You should use loop to do iteration. You should not
        //   using Stream API.
        // <-start-
        StringBuilder builder = new StringBuilder();
        for(int i : originalArray) {
            builder.append(i);
        }
        destination = builder.toString();
        // --end->

        assertEquals("12345", destination);
    }

    @Test
    void should_reverse_an_array() {
        String[] originalArray = {"A", "quick", "brown", "fox"};
        String[] reversed = null;

        // TODO: Please reverse the array to a new one. You should not modify original
        //   array.
        // <--start-
        reversed = new String[originalArray.length];
        for(int i = 0; i < originalArray.length; ++i) {
            reversed[originalArray.length - i - 1] = originalArray[i];
        }
        // --end->

        assertArrayEquals(new String[] {"fox", "brown", "quick", "A"}, reversed);
        assertArrayEquals(new String[] {"A", "quick", "brown", "fox"}, originalArray);
    }
}
