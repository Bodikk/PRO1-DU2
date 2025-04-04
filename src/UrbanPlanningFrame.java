import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class UrbanPlanningFrame extends JFrame {
    private static JTextField sizeField;
    private  DrawingFrame drawingPanel;

    public UrbanPlanningFrame() {
        setTitle("Domečky");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(2, 1));
        sizeField = new JTextField("50");
        JButton resetButton = new JButton("Reset");

        drawingPanel = new DrawingFrame();

        resetButton.addActionListener(e -> drawingPanel.clearHouses());

        leftPanel.add(sizeField);
        leftPanel.add(resetButton);

        add(leftPanel, BorderLayout.WEST);
        add(drawingPanel, BorderLayout.CENTER);
    }

    public static int getHouseSize() {
        try {
            int size = Integer.parseInt(sizeField.getText());
            return Math.max(size, 10);
        } catch (NumberFormatException e) {
            return 50;
        }
    }
}
