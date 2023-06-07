import javax.swing.*;
import java.awt.*;

class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("myFrame");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setBackground(Color.ORANGE);

        JLabel nameLabel = new JLabel("Kasper Prusak");
        nameLabel.setBounds(10, 10, screenSize.width, 50);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(nameLabel);

        JLabel italicLabel = new JLabel("Text - italics");
        italicLabel.setBounds(100, 100, 200, 30);
        italicLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(italicLabel);

        JLabel underlineLabel = new JLabel("<html><u>Text - underlined</u></html>");
        underlineLabel.setBounds(200, 200, 200, 30);
        underlineLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(underlineLabel);

        JLabel normalLabel = new JLabel("Text - ordinary");
        normalLabel.setBounds(300, 300, 200, 30);
        normalLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(normalLabel);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}