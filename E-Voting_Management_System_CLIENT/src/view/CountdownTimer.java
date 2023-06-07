package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class CountdownTimer extends JFrame implements ActionListener {

    private JLabel countdownLabel;
    private Timer countdownTimer;
    private Date deadline;

    public CountdownTimer() {
        // Create a new label for the countdown
        countdownLabel = new JLabel();
        countdownLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        Dimension size = new Dimension(countdownLabel.getPreferredSize().width, 100); // set the preferred height to 50 pixels
        countdownLabel.setPreferredSize(size);

        // Add the label to the frame
        getContentPane().add(countdownLabel, BorderLayout.CENTER);

        // Create a new timer to update the countdown every second
        countdownTimer = new Timer(1000, this);
        countdownTimer.setRepeats(true);
    }

    public void actionPerformed(ActionEvent e) {
        long remainingTime = deadline.getTime() - System.currentTimeMillis(); // Calculate the remaining time until the deadline

        if (remainingTime <= 0) { // If the remaining time is less than or equal to zero
            countdownLabel.setText("Time's up!"); // Display "Time's up!" in the label
            countdownTimer.stop(); // Stop the timer
        } else { // Otherwise
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss, dd/MM/yyyy"); // Create a new date format to display the remaining time
            String remainingTimeString = format.format(new Date(remainingTime)); // Format the remaining time as a string

            countdownLabel.setText("Deadline: " + remainingTimeString); // Update the label with the remaining time
        }
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void startCountdown() {
        countdownTimer.start();
    }

    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer();

        // Create a new JFrame to hold the timer
        JFrame frame = new JFrame("Countdown Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(timer.countdownLabel);
        frame.setSize(400, 100);
        frame.setVisible(true);

// Create a new panel to hold the deadline input fields and button
JPanel deadlinePanel = new JPanel();
deadlinePanel.setPreferredSize(new Dimension(500, 60)); // set preferred size for the panel
deadlinePanel.add(new JLabel("Enter deadline timestamp in seconds:"));

final JTextField deadlineField = new JTextField(20);
deadlineField.setPreferredSize(new Dimension(150, 30)); // set preferred size for the text field
deadlinePanel.add(deadlineField);

JButton setButton = new JButton("Set");
setButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the deadline in seconds entered by the user
            long deadlineInSeconds = Long.parseLong(deadlineField.getText());
            
            // Calculate the deadline as a Date object
            Date deadline = new Date(System.currentTimeMillis() + (deadlineInSeconds * 1000));
            
            // Set the deadline in the timer object
            timer.setDeadline(deadline);
            
            // Start the countdown
            timer.startCountdown();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid time format. Please enter the deadline in seconds.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});
deadlinePanel.add(setButton);

// Add the deadline panel to the frame
frame.getContentPane().add(deadlinePanel, BorderLayout.SOUTH);
    }

}
