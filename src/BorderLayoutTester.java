
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

// Border Layout Demo
public class BorderLayoutTester extends JFrame {

    private JButton upButton;
    private JButton downButton;
    private JButton leftButton;
    private JButton rightButton;
    private JButton centerButton;

    public void initialize() {

        // contentPane's default layout manager --> Border Layout
        Container contentPane = getContentPane();
        upButton = new JButton("Up");
        downButton = new JButton("Down");
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        centerButton = new JButton("Center");

        contentPane.add(upButton, BorderLayout.NORTH);
        contentPane.add(downButton, BorderLayout.SOUTH);
        contentPane.add(leftButton, BorderLayout.WEST);
        contentPane.add(rightButton, BorderLayout.EAST);
        contentPane.add(centerButton, BorderLayout.CENTER);

        ButtonObserver observer = new ButtonObserver();

        upButton.addActionListener(observer);
        downButton.addActionListener(observer);
        leftButton.addActionListener(observer);
        rightButton.addActionListener(observer);
        centerButton.addActionListener(observer);

    }

    private class ButtonObserver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            if (source == upButton) {
                System.out.println("Up button pressed");
            } else if (source == downButton) {
                System.out.println("Down button pressed");
            } else if (source == leftButton) {
                System.out.println("Left button pressed");
            } else if (source == rightButton) {
                System.out.println("Right button pressed");
            } else if (source == centerButton) {
                System.out.println("Center button pressed");
            } else {
                System.out.println("It is time to buy a new computer!");
            }

        }
    }
}
