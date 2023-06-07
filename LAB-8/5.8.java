import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FramePointsLines extends JFrame {
    private Point previousPoint;
    
    public FramePointsLines() {
        super("Frame with points and lines");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        
        previousPoint = null;
        
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Point newPoint = e.getPoint();
                if (previousPoint != null) {
                    Graphics g = getGraphics();
                    g.setColor(Color.BLACK);
                    g.drawLine(previousPoint.x, previousPoint.y, newPoint.x, newPoint.y);
                }
                Graphics g = getGraphics();
                g.setColor(Color.RED);
                g.fillOval(newPoint.x - 2, newPoint.y - 2, 4, 4);
                previousPoint = newPoint;
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FramePointsLines().setVisible(true);
            }
        });
    }
}