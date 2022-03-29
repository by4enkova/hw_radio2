package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {}

    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
    }

    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        return currentStation;
    }


    public int setNumberOfCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return currentStation;
        }
        if (currentStation <= minStation) {
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
        this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}

