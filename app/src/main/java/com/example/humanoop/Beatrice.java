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

    public void eat(int currentWeight) {
        super.eat();
        Log.d("Beatrice", "I am eating food and i am adding" + (currentWeight + 1) + "kgs"); }

     public void birthday(int currentBirthday){Log.d("Beatrice", "I will be turning" + " "+ currentBirthday + 4 );
     }


}