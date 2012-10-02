package dip.lab3;

/**
 *
 * @author Jonathon
 */
public class MessagingIOService {
    private InputStrategy newInput;
    private OutputStrategy newOutput;

    public MessagingIOService(InputStrategy newInput, OutputStrategy newOutput) {
        this.newInput = newInput;
        this.newOutput = newOutput;
    }
    public void inputMessage(){
        newInput.inputMessage();
    }
    public void sendMessage(){
        newOutput.sendMessage(newInput.getMessage());
    }
}
