package com.shan.idea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void hasFourCorners() {
        Assertions.assertEquals(4, Square.getCornerCount());
    }
}