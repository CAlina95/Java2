package ru.homework1;

import java.util.Random;

public class Treadmill {

    private final int distance;


    public int getDistance() {

        return distance;
    }

    public Treadmill(int distance) {

        this.distance = distance;
    }
    private static final Random random = new Random();
}
