package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /* ------------------------------
       Havlayan Köpek Testleri
       ------------------------------ */
    @Test
    void shouldWakeUpAtNightWhenDogBarks() {
        assertTrue(Main.shouldWakeUp(true, 1));
    }

    @Test
    void shouldNotWakeUpWhenDogDoesNotBark() {
        assertFalse(Main.shouldWakeUp(false, 2));
    }

    @Test
    void shouldNotWakeUpAtBoundaryHour() {
        assertFalse(Main.shouldWakeUp(true, 8));
    }

    @Test
    void shouldReturnFalseForInvalidHour() {
        assertFalse(Main.shouldWakeUp(true, -1));
        assertFalse(Main.shouldWakeUp(true, 24));
    }

    /* ------------------------------
       Yaş Tespiti Testleri
       ------------------------------ */
    @Test
    void hasTeenShouldReturnTrue() {
        assertTrue(Main.hasTeen(9, 99, 19));
        assertTrue(Main.hasTeen(23, 15, 42));
    }

    @Test
    void hasTeenShouldReturnFalse() {
        assertFalse(Main.hasTeen(22, 23, 34));
    }

    /* ------------------------------
       Oyuncu Kedi Testleri
       ------------------------------ */
    @Test
    void catShouldNotPlayWhenTooColdInSummer() {
        assertFalse(Main.isCatPlaying(true, 10));
    }

    @Test
    void catShouldNotPlayWhenTooHotInWinter() {
        assertFalse(Main.isCatPlaying(false, 36));
    }

    @Test
    void catShouldPlayInWinterAtUpperLimit() {
        assertTrue(Main.isCatPlaying(false, 35));
    }

    @Test
    void catShouldPlayInSummerAtHigherLimit() {
        assertTrue(Main.isCatPlaying(true, 45));
    }

    /* ------------------------------
       Alan Hesaplama (Dikdörtgen)
       ------------------------------ */
    @Test
    void areaOfRectangleShouldReturnCorrectValue() {
        assertEquals(20.0, Main.area(5.0, 4.0));
    }

    @Test
    void areaOfRectangleShouldReturnMinusOneForNegative() {
        assertEquals(-1, Main.area(-1.0, 4.0));
    }

    /* ------------------------------
       Alan Hesaplama (Daire)
       ------------------------------ */
    @Test
    void areaOfCircleShouldReturnCorrectValue() {
        assertEquals(78.53975, Main.area(5.0), 0.00001);
    }

    @Test
    void areaOfCircleShouldReturnMinusOneForNegativeRadius() {
        assertEquals(-1, Main.area(-1));
    }
}