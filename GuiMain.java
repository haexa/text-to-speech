import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vin on 30/01/2017.
 */
public class GuiMain {
    private JButton btnSpeak;
    private JPanel mainPanel;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiMain");
        frame.setContentPane(new GuiMain().mainPanel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GuiMain(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        Dimension button = new Dimension(20,20);
        btnSpeak = new JButton();
        btnSpeak.setText(">");
        btnSpeak.setPreferredSize(button);
        textField1 = new JTextField(25);
        mainPanel.add(textField1);
        mainPanel.add(btnSpeak);

        btnSpeak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String test = textField1.getText();
                System.out.println(test);
            }
        });
    }
}
