package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
class MainTest {

    @Test
    public void testShouldWakeUp(){
        assertEquals(Methods.shouldWakeUp(true, 1), true);
        assertEquals(Methods.shouldWakeUp(false, 2), false);
        assertEquals(Methods.shouldWakeUp(true, 8), false);
        assertEquals(Methods.shouldWakeUp(true, -1), false);
    }

    @Test
    public void hasTeenTest(){
        assertEquals(Methods.hasTeen(9, 99, 19), true);
        assertEquals(Methods.hasTeen(23, 15, 42), true);
        assertEquals(Methods.hasTeen(22, 23, 34), false);
    }

    @Test
    public void testIsCatPlaying(){
        assertEquals(Methods.isCatPlaying(true, 10), false);
        assertEquals(Methods.isCatPlaying(false, 36), false);
        assertEquals(Methods.isCatPlaying(false, 35), true);
    }

    @Test
    public void testArea(){
        assertEquals(Methods.area(5.0, 4.0), 20);
        assertEquals(Methods.area(-1.0, 4.0), -1);
    }

    @Test
    public void testSingleArea(){
        assertEquals(Methods.area(5.0), 78.53981633974483);
        assertEquals(Methods.area(-1.0), -1);
    }

}