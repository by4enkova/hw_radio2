package ru.netology.radioman;

public class Radio {
    public int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;


    public Radio (int currentRadioStation, int maxRadioStation, int currentVolume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }
    }


}
