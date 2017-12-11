package ru.geekbrains.participants;

public class Animal implements iChallenagable{
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected boolean onDistance;

    protected String name;
    public Animal(int maxRunDistance, int maxJumpHeight, int maxSwimDistance, String name){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.name = name;
        this.onDistance = true;
    }
    public void run(int distance){
        if(distance <= this.maxRunDistance) System.out.println(this.name + " пробежал дистанцию");
        else {
            this.onDistance = false;
            System.out.println(this.name + " не пробежал дистанцию");
        }

    }
    public void swim(int distance){
        if(distance <= this.maxSwimDistance) System.out.println(this.name + " проплыл дистанцию");
        else {
            this.onDistance = false;
            System.out.println(this.name + " не проплыл дистанцию");
        }
    }
    public void jump(int height){
        if(height <= this.maxJumpHeight) System.out.println(this.name + " перепрыгнул препятствие");
        else{
            this.onDistance = false;
            System.out.println(this.name + " не перепрыгнул препятствие");
        }
    }
    public void printResult(){
        if(onDistance) System.out.println(this.name + " прошел дистанцию");
        else System.out.println(this.name + " не прошел дистанцию");
    }
    public boolean isOnDistance(){
        return onDistance;
    }

    public String getName() {
        return name;
    }
}
