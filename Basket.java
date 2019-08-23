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
public class Basket {
    Food apple;
    Food banana;
    Food plum;
    Food hotDog;
    
    //Constructor
    public Basket() {
        apple = new Food("apple", 1);
        banana = new Food("banana", 1);
        plum = new Food("plum", 1);
        hotDog = new Food("hot dog", 2);
    }
}
