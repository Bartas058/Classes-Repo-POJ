import javax.swing.*;
import java.awt.*;

class TwoFrames {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createTextFrame();
            createImageFrame();
        });
    }

    private static void createTextFrame() {
        JFrame frame = new JFrame("TextFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Centred text");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }

    private static void createImageFrame() {
        JFrame frame = new JFrame("GraphicFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
    
        ImageIcon imageIcon = new ImageIcon("quote.jpg");
        JLabel label = new JLabel(imageIcon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);
    
        frame.setVisible(true);
    }
}