package com.twc.javabasic;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {
    @Test
    void should_turn_collections_to_arrays() {
        Collection<String> arrayCollection = new LinkedList<>();

        arrayCollection.add("Amy");
        arrayCollection.add("Bob");
        arrayCollection.add("Carl");

        String[] array = null;
        // TODO: Please turn array collection into string arrays.
        // <-start-
        array = arrayCollection.toArray(new String[0]);
        // --end-->

        assertArrayEquals(new String[]{"Amy", "Bob", "Carl"}, array);
    }

    @Test
    void should_remove_duplication_from_a_list() {
        List<String> listWithDuplication = Arrays.asList(
                "tiger", "monkey", "tiger", "panda", "monkey");
        List<String> withoutDuplication = null;

        // TODO: Remove duplications in `listWithDuplication` and please reserve the
        //   original order. You should not use Streaming API.
        // <-start-
        withoutDuplication = new ArrayList<>();
        for (String value : listWithDuplication) {
            if (!withoutDuplication.contains(value)) {
                withoutDuplication.add(value);
            }
        }
        // --end->

        assertIterableEquals(Arrays.asList("tiger", "monkey", "panda"), withoutDuplication);
    }

    @Test
    void should_iterate_over_an_iterable() {
        final Iterator<String> iterator = Arrays.asList("tiger", "monkey", "panda").iterator();
        final List<String> cloned = new ArrayList<>();

        // TODO: Please iterate over the `iterable` and turn them into upper-case
        //   words. You should not use Streaming API.
        // <-start-
        while (iterator.hasNext()) {
            cloned.add(iterator.next().toUpperCase());
        }
        // --end-->

        assertIterableEquals(
                Arrays.asList("TIGER", "MONKEY", "PANDA"),
                cloned);
    }

    @Test
    void should_sum_up_all_the_numbers() {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = 0;

        // TODO: sum all the numbers. You should not use Streaming API.
        // <-start-
        for (int value : numbers) {
            sum += value;
        }
        // --end->

        assertEquals(55, sum);
    }

    @Test
    void should_sort_collection_in_place() {
        List<Integer> numbers = Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9);

        // TODO: Please sort the list in-place. You should use existed method to
        //   do sorting work. You should not use Streaming API.
        // <-start-
        numbers.sort(Integer::compare);
        // --end-->

        assertEquals(Arrays.asList(1, 2, 4, 6, 8, 9, 33, 76), numbers);
    }

    @Test
    void should_create_sorted_collection() {
        final List<Integer> unsorted = Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9);
        List<Integer> sorted = null;

        // TODO: Please create new sorted list. You should use existed method to
        //   do sorting work. You should not use Streaming API.
        // <-start-
        sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted);
        // --end-->

        assertEquals(Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9), unsorted);
        assertEquals(Arrays.asList(1, 2, 4, 6, 8, 9, 33, 76), sorted);
    }

    @Test
    void should_creating_a_histogram() {
        String text =
                "A panda walks into a cafe. He orders a sandwich, eats it, then " +
                        "draws a gun and fires two shots in the air." +
                        "\"Why?\" asks the confused waiter, as the panda makes towards the exit." +
                        "The panda produces a badly punctuated wildlife manual and tosses it over" +
                        "his shoulder. \"I'm a panda,\" he says, at the door." +
                        "\"Look it up.\" The waiter turns to the relevant entry and, sure enough, " +
                        "finds an explanation..." +
                        "\"Panda. Large black-and-white bear-like mammal, native to China. Eats, " +
                        "shoots and leaves.\"";
        Map<Character, Integer> histogram = new HashMap<>();

        // TODO: create a histogram with statistics of all occurrence of English letters
        //   case insensitive. You should not using Streaming API.
        // <-start-
        for (char letter = 'a'; letter <= 'z'; ++letter) {
            histogram.put(letter, 0);
        }
        for (char letter : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(letter)) {
                histogram.put(letter, histogram.get(letter) + 1);
            }
        }
        // --end->

        assertEquals(26, histogram.size());
        assertEquals(52, histogram.get('a'));
        assertEquals(3, histogram.get('b'));
        assertEquals(7, histogram.get('c'));
        assertEquals(22, histogram.get('d'));
        assertEquals(40, histogram.get('e'));
        assertEquals(5, histogram.get('f'));
        assertEquals(3, histogram.get('g'));
        assertEquals(20, histogram.get('h'));
        assertEquals(21, histogram.get('i'));
        assertEquals(0, histogram.get('j'));
        assertEquals(6, histogram.get('k'));
        assertEquals(14, histogram.get('l'));
        assertEquals(6, histogram.get('m'));
        assertEquals(28, histogram.get('n'));
        assertEquals(20, histogram.get('o'));
        assertEquals(9, histogram.get('p'));
        assertEquals(0, histogram.get('q'));
        assertEquals(18, histogram.get('r'));
        assertEquals(29, histogram.get('s'));
        assertEquals(34, histogram.get('t'));
        assertEquals(11, histogram.get('u'));
        assertEquals(4, histogram.get('v'));
        assertEquals(10, histogram.get('w'));
        assertEquals(2, histogram.get('x'));
        assertEquals(4, histogram.get('y'));
        assertEquals(0, histogram.get('z'));
    }
}
