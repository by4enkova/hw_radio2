package ru.netology.radioman;

public class Radio {
    public int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 10) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }


}
