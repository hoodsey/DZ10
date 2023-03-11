import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetIncreaseNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.nextNumber();
        int expected = 8;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.prevNumber();
        int expected = 6;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prevNumber();
        int expected = 9;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.nextNumber();
        int expected = 0;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.setCurrentNumber(22);
        int expected = 7;

        long actual = radio.currentNumber;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.nextVolume();
        int expected = 9;

        long actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.prevVolume();
        int expected = 0;

        long actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.nextVolume();
        int expected = 8;

        long actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.prevVolume();
        int expected = 6;

        long actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
}
