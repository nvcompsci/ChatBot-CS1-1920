/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotapp;

/**
 *
 * @author jword
 */
public class ChatBot {
    //Fields (object variables)
    private String name;
    private int age;
    private double weight;
    
    //Constructor (Creates the object)
    public ChatBot() {
        name = "Bob";
        age = 4;
        weight = 50;
    }
    
    //Getters and Setters

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
        if (age > 0) 
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    //Methods (What the object does)
    public String respond(String prompt) {
        return "I don't understand yet.";
    }
    
    public void eat(Food food) {
        weight += food.weight;
    }
}
