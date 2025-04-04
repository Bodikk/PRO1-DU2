import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingFrame extends JPanel {
    private final List<Dum> houses = new ArrayList<>();
    public DrawingFrame() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int size = UrbanPlanningFrame.getHouseSize();
                houses.add(new Dum(e.getX(), e.getY(), size));
                repaint();
            }
        });
    }

    public void clearHouses() {
        houses.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Dum house : houses) {
            house.draw(g);
        }
    }

}
