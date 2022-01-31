package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStation = 5;
        int expected = 5;
        int actual = radio.currentRadioStation;

        assertEquals (expected, actual);
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(12);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals (expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    public void shouldNotChangeIfVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    public void shouldNotChangeIfVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    public void shouldSetIfVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    public void shouldSetIfVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }
}