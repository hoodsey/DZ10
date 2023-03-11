import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetNumber() {
        Radio radio = new Radio();
        radio.currentNumber = 2;

        int expected = 2;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseNumber() {
        Radio radio = new Radio();
        radio.currentNumber = 7;
        radio.nextNumber();
        int expected = 8;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceNumber() {
        Radio radio = new Radio();
        radio.currentNumber = 7;
        radio.prevNumber();
        int expected = 6;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.currentNumber = 0;
        radio.prevNumber();
        int expected = 10;

        long actual = radio.currentNumber;

       assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.currentNumber = 9;
        radio.nextNumber();
        int expected = 0;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }
}
