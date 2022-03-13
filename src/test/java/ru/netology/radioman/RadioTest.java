package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio(10, 10, 50, 100);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        assertEquals (expected, actual);
    }
    @Test
    void setCurrentRadioStationBackIfUnderMin() {
        Radio radio = new Radio(10, 10,50, 100);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        assertEquals (expected, actual);
    }

    @Test
    void setCurrentRadioStationBackIfOverMax() {
        Radio radio = new Radio(10,10,50,100);
        int currentRadioStation = 11;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void notChangeOnNextRadioStationIfMaxStation() {
        Radio radio = new Radio(10,10,50,100);
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void nextRadioStation() {
        Radio radio = new Radio(10,10,50,100);
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio(10,10,50,100);
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    void prevRadioStationIfMinStation() {
        Radio radio = new Radio(10,10,50,100);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }





    @Test
    void shouldSetVolumeIfVolumeOverMax() {
        Radio radio = new Radio(10,10,100,100);
        int currentVolume = 101;
        radio.setCurrentVolume(currentVolume);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    void shouldSetIfVolumeUnderMin() {
        Radio radio = new Radio(10,10,0,100);
        int currentVolume = -2;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio(10,10,50,100);
        int currentVolume = 6;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio(10,10,50,100);
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);

    }

    @Test
    void shouldNotChangeIfVolumeMin() {
        Radio radio = new Radio(10,10,50,100);
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }



    @Test
    void shouldNotChangeIfVolumeMax() {
        Radio radio = new Radio(10,10,100,100);
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals (expected, actual);
    }
}