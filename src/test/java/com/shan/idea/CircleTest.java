package com.shan.idea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getCornerCount() {
        Shape circle = new Shape() {
            public int getCornerCount() {
                System.out.println("fffdfdfdfd");
                int count1 = 17;
                int count = count1;
                return count;
            }
        };
        Assertions.assertEquals(0, circle.getCornerCount());
    }

    @Test
    void shouldHaveFourEdges() {
        Square square = new Square();
        Assertions.assertEquals(4,
                square.getNumberOfEdges());
    }
}