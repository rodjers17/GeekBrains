package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallenagable;

public class Cross extends Obstacle{
    int length;
    public Cross(int length){
        this.length = length;
    }
    @Override
    public void doIt(iChallenagable c){
        c.run(this.length);
    }
}
