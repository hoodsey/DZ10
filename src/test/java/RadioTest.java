import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testConstWithParametrs() {
        Radio radio = new Radio(20);
        int expected = 20;

        long actual = radio.GetDefaultNumber();
        assertEquals(expected, actual);
        assertEquals(0, radio.GetMinNumber());
        assertEquals(0, radio.GetMinVolume());
        assertEquals(100, radio.GetMaxVolume());
    }
    @Test
    public void testConstNotParametrs() {
        Radio radio = new Radio();
        int expected = 10;

        long actual = radio.GetDefaultNumber();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetIncreaseNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentNumber(7);
        radio.nextNumber();
        int expected = 8;

        long actual = radio.GetCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentNumber(7);
        radio.prevNumber();
        int expected = 6;

        long actual = radio.GetCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentNumber(0);
        radio.prevNumber();
        int expected = 9;

        long actual = radio.GetCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentNumber(9);
        radio.nextNumber();
        int expected = 0;

        long actual = radio.GetCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentNumber(7);
        radio.setCurrentNumber(22);
        radio.setCurrentNumber(-3);
        int expected = 7;

        long actual = radio.GetCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(-9);
        radio.setCurrentVolume(999);
        radio.nextVolume();
        int expected = 100;

        long actual = radio.GetCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;

        long actual = radio.GetCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(7);
        radio.nextVolume();
        int expected = 8;

        long actual = radio.GetCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetReduceVolume() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(7);
        radio.prevVolume();
        int expected = 6;

        long actual = radio.GetCurrentVolume();

        assertEquals(expected, actual);
    }
}
