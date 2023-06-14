package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int stationQuantity = 10;


    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previous() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
        public void upVolume () {
            if (currentStation != 100) {
                currentVolume++;
            } else {
                currentVolume = 100;
            }
        }

        public void downVolume () {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            } else {
                currentVolume = 0;
            }
        }
    }