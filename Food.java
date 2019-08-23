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
public class Food {
    //Fields
    private int weight;
    private String name;
    
    //Constructor
    public Food(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }
    //Getters and Setters
    
    
    //Methods

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
