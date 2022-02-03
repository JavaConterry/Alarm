import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Alarm {

    String[] timeStrings = { "10.00", "11.00", "12.00", "13.00", "14.00" };
    private JComboBox preferredTime = new JComboBox(timeStrings);
    private JTextArea timeBeforeRinging;
    private JButton applyButton;
    private JPanel mainPanel;


    public Alarm() {
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "");
            }
        });
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Conty's alarm");
        frame.setContentPane(new Alarm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
