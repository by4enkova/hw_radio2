package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(10);


    @Test
    void setCurrentStationBackIfUnderMin() {
        radio2.setCurrentStation(-1);
        int expected = 0;
        int actual = radio2.getCurrentStation();

        assertEquals (expected, actual);
    }

    @Test
    void setCurrentStation() {
        radio2.setCurrentStation(1);
        int expected = 1;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationBackIfOverMax() {
        radio2.setCurrentStation(11);
        int expected = 0;
        int actual = radio2.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void changeOnNextRadioStationIfMaxStation() {
        radio2.setCurrentStation(9);
        radio2.nextStation();
        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void nextRadioStation() {
        radio2.setCurrentStation(5);
        radio2.nextStation();
        int expected = 6;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        radio2.setCurrentStation(5);
        radio2.prevStation();
        int expected = 4;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void prevRadioStationIfMinStation() {
        radio2.setCurrentStation(0);
        radio2.prevStation();
        int expected = 9;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
    }



    @Test
    void shouldSetVolumeIfVolumeOverMax() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    void shouldSetIfVolumeUnderMin() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.decreaseVolume();
        int expected = 59;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.increaseVolume();
        int expected = 61;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    void shouldNotChangeIfVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }



    @Test
    void shouldNotChangeIfVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

}