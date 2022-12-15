package ru.netology.radio;

public class Radio {
    private int numberOfStations = 10; //количество станций
    private int minVolume = 0; //минимальный звук
    private int maxVolume = 100; //максимальный звук
    private int numberStation; //номер текущей радиостанции
    int soundVolume; // громкость звука

    public Radio () { //конструктор по умолчанию

    }

    public Radio (int numberStations) {
        this.numberOfStations = numberStations;
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentNumberStation() {
        return numberStation;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setCurrentNumberStation(int station) {
        if (station >= 0) {
            if (station <= numberOfStations-1) {
                this.numberStation = station;
            }
        }
    }

    void setCurrentSoundVolume(int volume) {
        if (volume >= minVolume) {
            if (volume <= maxVolume) {
                this.soundVolume = volume;
            }
        }
    }

    public void increaseVolume() {
        if (getCurrentSoundVolume() < maxVolume) {
            setCurrentSoundVolume(getCurrentSoundVolume() + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentSoundVolume() > minVolume) {
            setCurrentSoundVolume(getCurrentSoundVolume() - 1);
        }
    }

    public void moveNextStation() {
        if (getCurrentNumberStation() == numberOfStations-1) {
            setCurrentNumberStation(0);
        } else {
            setCurrentNumberStation(getCurrentNumberStation() + 1);
        }
    }

    public void movePrevStation() {
        if (getCurrentNumberStation() == 0) {
            setCurrentNumberStation(numberOfStations-1);
        } else {
            setCurrentNumberStation(getCurrentNumberStation() - 1);
        }
    }

}

