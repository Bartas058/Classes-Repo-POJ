import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseClickFrame extends JFrame {
    private int leftClickCount = 0;
    private int rightClickCount = 0;

    public MouseClickFrame() {
        setTitle("Mouse Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());

        JLabel leftClickLabel = new JLabel("Left Clicks: 0");
        JLabel rightClickLabel = new JLabel("Right Clicks: 0");

        contentPane.add(leftClickLabel);
        contentPane.add(rightClickLabel);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    leftClickCount++;
                    leftClickLabel.setText("Left Clicks: " + leftClickCount);
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    rightClickCount++;
                    rightClickLabel.setText("Right Clicks: " + rightClickCount);
                }
            }
        });

        setContentPane(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseClickFrame::new);
    }
}