
import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 *
 * @author darron moraes
 */
public class MainFrame extends JFrame {
    
    
    
    // Method to initialize the frame
    public void init() {
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    // To run the window in the same file as coded
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.init();
    }
}
