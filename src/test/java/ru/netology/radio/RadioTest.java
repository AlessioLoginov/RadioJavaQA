package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentNumberStationCorrect() {
        Radio myRadio = new Radio();
        myRadio.setCurrentNumberStation(5);
        int expected = 5;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentNumberStationIncorrect() {
        Radio myRadio = new Radio();
        myRadio.setCurrentNumberStation(15);
        int expected = 0;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberStationIncorrectLessZero() {
        Radio myRadio = new Radio();
        myRadio.setCurrentNumberStation(-10);
        int expected = 0;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCorrect() {
        Radio myRadio = new Radio();
        myRadio.increaseVolume();
        int expected = 1;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldIncreaseVolumeInCorrectMoreMax() {
        Radio myRadio = new Radio();
        myRadio.soundVolume = 150;
        myRadio.increaseVolume();
        int expected = 150;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeCorrectMoreMax() {
        Radio myRadio = new Radio();
        myRadio.setCurrentSoundVolume(150);
        int expected = 0;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInCorrectLessZero() {
        Radio myRadio = new Radio();
        myRadio.setCurrentSoundVolume(-5);
        int expected = 0;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIncorrect() {
        Radio myRadio = new Radio();
        for (int i = 1; i < myRadio.getMaxVolume() ; i++) {
            myRadio.increaseVolume();
        }
        myRadio.increaseVolume();
        int expected = myRadio.getMaxVolume();
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInCorrect() {
        Radio myRadio = new Radio();
        myRadio.decreaseVolume();
        int expected = 0;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberMaxStation() {
        Radio myRadio = new Radio(20, 0 , 100, 10, 0);
        int expected = 20;
        int actual = myRadio.getNumberOfStations();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeCorrect() {
        Radio myRadio = new Radio();
        for (int i = 1; i < 5; i++) {
            myRadio.increaseVolume();
        }
        myRadio.decreaseVolume();
        int expected = 3;
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeCorrectMin() {
        Radio myRadio = new Radio();
        for (int i = 1; i < 5; i++) {
            myRadio.increaseVolume();
        }
        for (int i = 1; i < 6; i++) {
            myRadio.decreaseVolume();
        }
        int expected = myRadio.getMinVolume();
        int actual = myRadio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveNextStationCorrect() {
        Radio myRadio = new Radio();
        myRadio.moveNextStation();
        int expected = 1;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldMoveNextStationIncorrect() {
        Radio myRadio = new Radio();
        for (int i = 1; i < myRadio.getNumberOfStations(); i++) {
            myRadio.moveNextStation();
        }
        myRadio.moveNextStation();
        int expected = 0;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMovePrevStationIncorrect() {
        Radio myRadio = new Radio();
        myRadio.movePrevStation();
        int expected = myRadio.getNumberOfStations()-1;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMovePrevStationCorrect() {
        Radio myRadio = new Radio();
        for (int i = 1; i < 5; i++) {
            myRadio.moveNextStation();
        }
        myRadio.movePrevStation();
        int expected = 3;
        int actual = myRadio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }




}
