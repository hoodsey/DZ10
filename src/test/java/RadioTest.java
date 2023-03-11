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
    public void shouldSetincreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.nextVolume();
        int expected = 8;

        long actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextVolue() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.nextVolume();
        int expected = 0;

        long actual = radio.currentVolume;

       assertEquals(expected, actual);
    }
}
