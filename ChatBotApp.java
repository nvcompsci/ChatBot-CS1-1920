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
public class ChatBotApp {

    private static ChatBot cb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cb = new ChatBot();
        String response = cb.respond("Hello!");
        System.out.print(response);
    }
    
}
