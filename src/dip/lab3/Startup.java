package dip.lab3;

/**
 *
 * @author Jonathon
 */
public class Startup {
    public static void main(String[] args) {
        MessagingIOService newMessages = new MessagingIOService(new GUIInput(), new GUIOutput());
        newMessages.inputMessage();
        newMessages.sendMessage();
    }
}
