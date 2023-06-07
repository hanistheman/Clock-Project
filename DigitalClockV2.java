import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockV2 extends JFrame {
    private JLabel timeLabel;

    public DigitalClockV2() {
        setTitle("Digital Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setResizable(false);
        setLocationRelativeTo(null);
        // Setting the size and all that stuff on our clock
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        getContentPane().add(timeLabel);
        // Adding our new time object.

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        // Update the time every second and starting it
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String time = sdf.format(new Date());
        timeLabel.setText(time);
        // Using a new simple data format to format our time accordingly.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalClockV2 clock = new DigitalClockV2();
            clock.setVisible(true);
        });
    }
}
