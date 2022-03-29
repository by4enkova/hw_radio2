package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(35);


    @Test
    void shouldGetCurrentStation() {
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldGetCurrentStationIfMax() {
        int expected = 34;
        int actual = radio2.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationIfMin() {
        radio.setNumberOfCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setRadioStationIfMax() {
        radio2.setCurrentStation(35);
        int expected = 35;
        int actual = radio2.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setMaxCurrentStationBackIfUnderMin() {
        radio2.setCurrentStation(0);
        radio2.prevStation();
        int expected = 34;
        int actual = radio2.getCurrentStation();

        assertEquals (expected, actual);
    }

   @Test
    void setCurrentStationBackIfUnderMin2() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation() - 1;

        assertEquals (expected, actual);
    }

    @Test
    void changeOnNextRadioStationIfMaxStation() {
        radio.setNumberOfCurrentStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
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
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void getMinRadioStation() {
        radio.getMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
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
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }


    @Test
    void volumeUp() {
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void shouldNotChangeIfVolumeMax() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void getMinVolume() {
        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getMaxVolume() {
        int expected = 100;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

}





