package ru.netology.radio;

public class Radio {
    private int numberStation; //номер текущей радиостанции
    private int soundVolume; // громкость звука

    public int getCurrentNumberStation() {
        return numberStation;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setCurrentNumberStation(int station) {
        if (numberStation >= 0) {
            if (numberStation <= 9) {
                this.numberStation = station;
            }
        }
    }

        private void setCurrentSoundVolume ( int volume){
            this.soundVolume = volume;
        }

        public void increaseVolume () {
            if (getCurrentSoundVolume() < 10) {
                setCurrentSoundVolume(getCurrentSoundVolume() + 1);
            }
        }

        public void decreaseVolume () {
            if (getCurrentSoundVolume() > 0) {
                setCurrentSoundVolume(getCurrentSoundVolume() - 1);
            }
        }

        public void moveNextStation () {
            if (getCurrentNumberStation() == 9) {
                setCurrentNumberStation(0);
            } else {
                setCurrentNumberStation(getCurrentNumberStation() + 1);
            }
        }

        public void movePrevStation () {
            if (getCurrentNumberStation() == 0) {
                setCurrentNumberStation(9);
            } else {
                setCurrentNumberStation(getCurrentNumberStation() - 1);
            }
        }

    }

