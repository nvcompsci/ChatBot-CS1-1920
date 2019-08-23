/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotapp;

import java.util.Scanner;

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
        Scanner kb = new Scanner(System.in);
        String prompt = "";
        while (!prompt.equals("exit")) {
            prompt = kb.nextLine();
            String response = cb.respond(prompt);
            System.out.print(response);
        }
        
    }
    
}
