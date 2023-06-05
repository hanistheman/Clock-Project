import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class DigitalClock {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        // Create a frame to house our Digital clock and set the dimensions accordingly.

        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        frame.add(timeLabel);
        // Adding the time label to our new frame

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                // Format for the date
                Date date = new Date();
                // New Date object
                String time = sdf.format(date);
                // Format the time into a string from the SDF
                timeLabel.setText(time);
                // Set the label's text as our string from earlier. 
            }
        });

        timer.start();

        frame.setVisible(true);
    }
}