import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TwoFramesExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame1 = new JFrame("Frame - 1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 300);
        frame1.setLocationRelativeTo(null);

        JLabel background = new JLabel(new ImageIcon("plane.jpg"));
        frame1.setContentPane(background);

        frame1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    showSecondFrame();
                }
            }
        });

        JFrame frame2 = new JFrame("Frame - 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400, 300);
        frame2.setLocationRelativeTo(null);

        frame2.setVisible(false);

        frame1.setVisible(true);
        frame1.requestFocusInWindow();
    }

    private static void showSecondFrame() {
        JFrame frame2 = new JFrame("Frame - 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400, 300);
        frame2.setLocationRelativeTo(null);

        JLabel background = new JLabel(new ImageIcon("plane.jpg"));
        frame2.setContentPane(background);

        frame2.setVisible(true);
        frame2.requestFocusInWindow();
    }
}