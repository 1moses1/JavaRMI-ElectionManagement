
package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
//import static javafx.scene.paint.Color.color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TIME_DISPLAY extends JPanel implements ActionListener {
    private Date deadline; // declare a Date object to hold the deadline
    private JLabel countdownLabel; // declare a JLabel to display the countdown
    private Timer timer; // declare a Timer object to update the countdown
    public String remainingTimeString;
    public user_homepage user_homepage;
    String myVariable;
    public static String deadline_timer;

    public static String getDeadline_timer() {
        return deadline_timer;
    }
    
    
    
    

    public TIME_DISPLAY(Date deadline) {
        this.deadline = deadline; // initialize the deadline with the constructor argument
        this.countdownLabel = new JLabel(); // create a new label for the countdown
        this.countdownLabel.setFont(new Font("Arial", Font.BOLD, 18)); // set the font of the label
        
        this.add(this.countdownLabel); // add the label to the panel

        this.timer = new Timer(1000, this); // create a new timer to update the countdown every second
        this.timer.start(); // start the timer
        
    }
    

    public void actionPerformed(ActionEvent e) {
        long remainingTime = this.deadline.getTime() - new Date().getTime(); // calculate the remaining time until the deadline
        if (remainingTime <= 0) { // if the remaining time is less than or equal to zero
            this.countdownLabel.setText("Time's up!"); // display "Time's up!" in the label
            this.timer.stop(); // stop the timer
        } else { // otherwise
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // create a new date format to display the remaining time
            String remainingTimeString = format.format(new Date(remainingTime)); // format the remaining time as a string
            
            this.countdownLabel.setText("Deadline: " + remainingTimeString); // update the label with the remaining time
            
            
        }
        
        
    }
    
    public String setMyVariable(String remainingTimeString) {
        myVariable = remainingTimeString;
        return myVariable;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a new JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        frame.setSize(400, 100); // set the size of the frame

        Date deadline = new Date(System.currentTimeMillis() + 1683092695321L); // create a new Date object for the deadline (24 hours from now)
        TIME_DISPLAY countdownPanel = new TIME_DISPLAY(deadline); // create a new panel for the countdown
        frame.getContentPane().add(countdownPanel, BorderLayout.CENTER); // add the panel to the center of the frame
        //user_homepage= new user_homepage();
        frame.setVisible(true); // make the frame visible
    }
}
