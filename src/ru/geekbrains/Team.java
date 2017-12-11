package ru.geekbrains;
import ru.geekbrains.participants.Animal;

public class Team {

    public Team(String name, Animal[] participants) {
        this.name = name;
        this.participants = participants;
    }

    private String name;
    private Animal[] participants;

    public void getFullInfo(){
        System.out.println("Участник команды " + name + ":");
        for (Animal member : participants) {
            System.out.println(member.getName());
        }
    }

    public void showResults(){
        System.out.println("В команде \"" + name + "\" прошли дистанцию:");
        for (Animal member : participants) {
            if (member.isOnDistance())
                System.out.println(member.getName());
        }
    }

    public Animal[] getParticipants() {
        return participants;
    }
}
