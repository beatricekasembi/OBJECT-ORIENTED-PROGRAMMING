package com.example.humanoop;

import android.util.Log;

public class Human {
    private String name;
    private int age;
    private int weight;


    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() { Log.d("Human", "I am eating food"); }

    public void sleep() { Log.d("Human", "ZZZZZZzzzzzzzzzzzzzzzz");}

    public void speak(String speech){

        Log.d("Human","Be fearless in pursuit of what sets your soul on fire");
    }

    public void sleep(int hours){Log.d("Human","I am sleeping for " + hours + " " + "hours");}

    public void birthday (int currentAge){ Log.d("Human","I am turning " + (currentAge + 1) );

    }

}
