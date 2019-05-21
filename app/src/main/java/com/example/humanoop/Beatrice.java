package com.example.humanoop;

import android.util.Log;

public class Beatrice extends Human {

    private int height;


    public Beatrice(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Beatrice(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        int beatriceWeight = getWeight();
        beatriceWeight = beatriceWeight + 2;
        setWeight(beatriceWeight);
    }

    @Override
    public void birthday() {
        int newAge = getAge();
        newAge = newAge + 4;
        setAge(newAge);
    }
}