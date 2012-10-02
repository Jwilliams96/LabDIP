/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Jonathon
 */
public class ConsoleOutput implements OutputStrategy{
    public void sendMessage(String message){
        System.out.println(message);
    }
}
