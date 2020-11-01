package ru.homework1;

import java.util.Random;

public class Robot implements Jump, Run {

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

    public Robot(String name) {
        Random random = new Random();
        this.name = name;
        this.jumpLimit = 7 + random.nextInt(10);
        this.runLimit = 55 + random.nextInt(60);
    }


    @Override
    public boolean canJump() {
        if (jumpLimit >= maxWallValue) {
            System.out.println(getName() + " -- " + " прыгнул!!");
            return true;
        } else {
            System.out.println(getName()  + " -- " + " не прыгнул.");
            return false;
        }
    }

    @Override
    public boolean canRun() {
        if (this.runLimit >= maxTreadmillValue) {
            System.out.println(getName() + " -- " + " бегал!!");
            return true;
        } else {
            System.out.println(getName() + " -- " + " Жаль, не смог пробежать дистанцию.");
            return false;
        }
    }

    @Override
    public void info() {
        System.out.println("Робот: " + getName() + " *** " + " Может пригать: " + getJumpLimit() + " метров. " + " *** " + " Может бегать: " + getRunLimit() + "километра.");
    }
}
