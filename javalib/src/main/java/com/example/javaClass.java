package com.example;
import java.util.Random;

public class javaClass {
    private String[]jokes={
            "-Why do Java developer wear glasses?\n -Cause they don't C#.",
            "Algorithm : a word used by programmers when they don't want to explain what they did.",
            "- What do you call a programmer from Finland?\n -Nerdic."};
    public String getJoke() {
        Random rand = new Random();
        return jokes[rand.nextInt(3)];
    }
}
