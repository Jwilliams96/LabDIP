/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathon
 */
public class GUIOutput implements OutputStrategy {
    public void sendMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
