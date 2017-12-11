package ru.geekbrains;

import ru.geekbrains.obstacles.Obstacle;
import ru.geekbrains.participants.Animal;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Animal member : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(member);
                if(!member.isOnDistance()) break;
            }
        }
    }
}
