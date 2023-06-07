import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FrameSquare extends JFrame {
    private JPanel panel;
    private int x = 150;
    private int y = 150;

    public FrameSquare() {
        setTitle("Moving a square");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(x, y, 50, 50);
            }
        };

        panel.setFocusable(true);
        panel.requestFocusInWindow();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        y -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        y += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        x -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        x += 10;
                        break;
                }
                panel.repaint();
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameSquare frame = new FrameSquare();
                frame.setVisible(true);
            }
        });
    }
}