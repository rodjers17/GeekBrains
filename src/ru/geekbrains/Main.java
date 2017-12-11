package ru.geekbrains;

import ru.geekbrains.obstacles.Cross;
import ru.geekbrains.obstacles.Obstacle;
import ru.geekbrains.obstacles.Pool;
import ru.geekbrains.obstacles.Wall;
import ru.geekbrains.participants.Animal;
import ru.geekbrains.participants.Cat;
import ru.geekbrains.participants.Dog;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(1000, 5, 0, "Барсик"),
        new Dog( 2000, 2, 20, "Шарик"),
        new Cat(1200,4,15, "Мурзик"),
        new Dog(1000,1,15, "Тузик")};
        Team team = new Team("Чемпионы",animals);

        Obstacle[] obstacles = {new Cross(500), new Wall(2), new Pool(5)};
        Course course = new Course(obstacles);
        course.doIt(team);
        team.showResults();

        //System.out.println("Результаты:");
        //animals[0].printResult();
        //animals[1].printResult();
    }
}
