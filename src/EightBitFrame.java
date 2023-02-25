import javax.swing.*;
import java.awt.*;

public class EightBitFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        frame.setTitle("Apple II Terminal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(label);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("LCD Solid",Font.PLAIN, 18));

        label.setText("NEW APPLE 2 TERMINAL. JUST LIKE OLD!");
        frame.setVisible(true);
    }
}
