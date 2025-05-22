import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTextfield;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // always be aware of the colors that IntelliJ is using

    // create a constructor which is a special method to initialize our Objects

    public KiloConverter() {

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);
        setVisible(true);
    }

    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in kilometers");

        kiloTextfield = new JTextField(10);
        calcButton = new JButton("Calculate");
        panel = new JPanel();

        // add the above components to the JPanel

        panel.add(messageLabel);
        panel.add(kiloTextfield);
        panel.add(calcButton);
    //    panel.add();
    }

    public static void main(String[]args) {

        new KiloConverter();
    }
}
