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
    String name;
    int age;
    double weight;
    
    //Constructor (Creates the object)
    public ChatBot() {
        name = "Bob";
        age = 4;
        
    }
    
    //Getters and Setters
    
    //Methods (What the object does)
    public String respond(String prompt) {
        return "I don't understand yet.";
    }
}
