package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallenagable;

public class Wall extends Obstacle{
    int height;
    public Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(iChallenagable c){
        c.jump(this.height);
    }
}
