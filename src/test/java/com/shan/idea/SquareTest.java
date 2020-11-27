package com.shan.idea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class SquareTest {

    @Test
    void testGetId() {
        List<Integer> myList = Arrays.asList(1, 2, 34, 434434, 2323, 2323, 4, 423, 2323, 434341, 2, 3434, 32);

        List<Double> collect = myList.stream().map(Double::new).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        Optional<Integer> id = Square.getId(myList, 27);

        System.out.println("id = " + id);
        int val = id.orElse(10);
        Assertions.assertEquals(val, 2);
    }

    @Test
    void hasFourCorners() {
        Shape square = new Square();
        getAssertValue(square);

    }

    private void getAssertValue(Shape square) {
        Assertions.assertEquals(4, getCornerCount(square));
    }

    private int getCornerCount(Shape square) {
        return square.getCornerCount();
    }


}