package com.shan.idea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void hasFourCorners() {
        Shape square = new Square();
        getAssertValue(square);
    }

    private void getAssertValue(Shape square) {
        Assertions.assertEquals(4, getCornerCount(square));
    }

    private int getCornerCount(Shape square) {
        int cornerCount = square.getCornerCount();
        return cornerCount;
    }


}