import javax.swing.*;
import java.awt.*;


public class ShowWindow2 {

    public static void main(String[]args) {
//      declare our variables
//      we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 550; // in pixels
        final int WINDOW_HEIGHT = 450;

        // Create a window

        JFrame window = new JFrame();
        // similar to Scanner input = new Scanner(System.in) creating new thing (object?);
        // set the title
        window.setTitle("My Simple Window: Trying Again!");

        // set the size of the window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocation(550,400); // pixels from upper left corner
        window.getContentPane().setBackground(Color.getHSBColor(0.55f, 0.4f, 1.0f)); // 0-1 hue, saturation, brightness


        JLabel myLabel = new JLabel();
        JLabel myLabel2 = new JLabel();
        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();


        myLabel.setBounds(15,15,300,20); // xy pixels from upper left of window, width height in pixels
        myLabel.setText("This is label 1.");
        textField.setBounds(12,40,300,30);
        myLabel2.setBounds(15,220,300,20);
        myLabel2.setText("This is label 2.");
        myLabel2.setFont(new Font("Arial", Font.BOLD,16));
        textField2.setBounds(12,245,300,30);
        window.add(myLabel);
        window.add(textField);
        window.add(myLabel2);
        window.add(textField2);
        window.setLayout(null);
        window.setVisible(true);


    }
}
