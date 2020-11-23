package com.shan.idea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getCornerCount() {
        Circle circle = new Circle();
        Assertions.assertEquals(0, circle.getCornerCount());
    }

    @Test
    void shouldHaveFourEdges() {
        Square square = new Square();
        Assertions.assertEquals(4,
                square.getNumberOfEdges());
    }
}