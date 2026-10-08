package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AddTwoNumbersTest {
    @ParameterizedTest
    @MethodSource
    void testAddTwoNumbers(ListNode input1, ListNode input2, ListNode expectedAnswer) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode answer = addTwoNumbers.addTwoNumbers(input1, input2);
        List<Integer> arrayAnswer = listNodeToArraylist(answer, new ArrayList<>());
        List<Integer> arrayExpected = listNodeToArraylist(expectedAnswer, new ArrayList<>());

        assertIterableEquals(arrayAnswer, arrayExpected);
    }

    private static Stream<Arguments> testAddTwoNumbers() {
        return Stream.of(
                Arguments.of(
                        arrayToListNode(arrayToList(2, 4, 3)),
                        arrayToListNode(arrayToList(5, 6, 4)),
                        arrayToListNode(arrayToList(7, 0, 8))),
                Arguments.of(
                        arrayToListNode(arrayToList(0)),
                        arrayToListNode(arrayToList(0)),
                        arrayToListNode(arrayToList(0))),
                Arguments.of(
                        arrayToListNode(arrayToList(9, 9, 9, 9, 9, 9, 9)),
                        arrayToListNode(arrayToList(9, 9, 9, 9)),
                        arrayToListNode(arrayToList(8, 9, 9, 9, 0, 0, 0, 1))));
    }

    private static List<Integer> arrayToList(Integer... numbers) {
        return new ArrayList<>(Arrays.asList(numbers));
    }

    private static ListNode arrayToListNode(List<Integer> inputList) {
        int aux = inputList.removeFirst();
        if (inputList.isEmpty())
            return new ListNode(aux);

        return new ListNode(aux, arrayToListNode(inputList));
    }

    private static List<Integer> listNodeToArraylist(ListNode nodes, List<Integer> aux) {
        aux.add(nodes.val);
        if (nodes.next == null)
            return aux;

        return listNodeToArraylist(nodes.next, aux);
    }

}
