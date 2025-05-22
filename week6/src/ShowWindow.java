import javax.swing. *;

public class ShowWindow {
    public static void main(String[]args) {
//      declare our variables
//      we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350; // 350 pixels
        final int WINDOW_HEIGHT = 250;

        // Create a window

        JFrame window = new JFrame();
        // similar to Scanner input = new Scanner(System.in) creating new thing (object?);
        // set the title
        window.setTitle("My Simple Window");

        // set the size of the window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if you don't display the window, it will not display
        // displaying the window is a boolean
        window.setVisible(true);


    }
}
