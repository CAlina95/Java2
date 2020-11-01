package ru.homework1;

import java.util.Random;

public class Human implements Jump, Run {

    public int getJumpLimit() {

        return jumpLimit;
    }

    public int getRunLimit() {

        return runLimit;
    }

    public String getName() {

        return name;
    }

    private final int jumpLimit;
    private final int runLimit;
    private final String name;


    int maxWallValue;
    int maxTreadmillValue;


    public Human(String name) {
        Random random = new Random();
        this.name = name;
        this.jumpLimit = 4 + random.nextInt(5);
        this.runLimit = 10 + random.nextInt(11);
    }


    @Override
    public boolean canJump() {
        if (maxWallValue <= jumpLimit) {
            System.out.println(getName() + " -- " + " прыгнула!!");
            return true;
        } else {
            System.out.println(getName() + " -- " + " не прыгнула.");
            return false;
        }
    }

    @Override
    public boolean canRun() {
        if (maxTreadmillValue <= runLimit) {
            System.out.println(getName() + " -- " + " бегала!!");
            return true;
        } else {
            System.out.println(getName()  + " -- " + " Жаль, не смогла пробежать дистанцию.");
            return false;
        }
    }

    public void info() {
        System.out.println("Человек:" + getName() + " *** " + " Может пригать: " + getJumpLimit() + " метровю. " + " *** " + " Может бегать: " + getRunLimit() + "километра.");
    }
}
