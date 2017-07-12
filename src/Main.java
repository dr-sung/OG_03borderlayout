
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        BorderLayoutTester frame = new BorderLayoutTester();
        frame.initialize();
        frame.setSize(500, 500);
        frame.setTitle("Border Layout Demo");
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
