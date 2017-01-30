import javax.swing.*;

/**
 * Created by Vin on 30/01/2017.
 */
public class GuiMain {
    private JTextArea insertTextHereTextArea;
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiMain");
        frame.setContentPane(new GuiMain().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
