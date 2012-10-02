/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Jonathon
 */
public class ConsoleInput implements InputStrategy{
    String message = "";
    
    public void inputMessage(){
        Scanner keyboard = new Scanner(System.in);
        message = keyboard.nextLine();
    }
    
    public String getMessage(){
        return message;
    }
}
