package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int numberOfStations = 10; //количество станций
    private int minVolume = 0; //минимальный звук
    private int maxVolume = 100; //максимальный звук
    private int numberStation; //номер текущей радиостанции
    int soundVolume; // громкость звука



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
        if (soundVolume < maxVolume) {
            setCurrentSoundVolume(soundVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minVolume) {
            setCurrentSoundVolume(soundVolume - 1);
        }
    }

    public void moveNextStation() {
        if (numberStation == numberOfStations-1) {
            setCurrentNumberStation(0);
        } else {
            setCurrentNumberStation(numberStation + 1);
        }
    }

    public void movePrevStation() {
        if (numberStation == 0) {
            setCurrentNumberStation(numberOfStations-1);
        } else {
            setCurrentNumberStation(numberStation - 1);
        }
    }

}

