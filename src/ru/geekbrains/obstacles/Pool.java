package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallenagable;

public class Pool extends Obstacle {
    int length;
    public Pool(int length){
        this.length = length;
    }
    @Override
    public void doIt(iChallenagable c){
        c.swim(this.length);
    }
}
