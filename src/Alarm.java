import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Alarm {

    private JTextArea timeBeforeRinging;
    private JButton applyButton;
    private JPanel mainPanel;
    private JSpinner timeSpinner;

    public Alarm() {
        System.out.println("a3");
        createSpinner();
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "fuckin shit");
            }
        });
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Conty's alarm");
        frame.setContentPane(new Alarm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("a1");
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

    private void createSpinner() {
        System.out.println("a2");
        Date date = new Date();
        SpinnerDateModel dateModel = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        System.out.println(dateModel.getDate());
        this.timeSpinner = new JSpinner(dateModel);
        System.out.println(timeSpinner.getValue());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
        timeSpinner.setEditor(dateEditor);
        System.out.println(timeSpinner.getValue());

    }
}
