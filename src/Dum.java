import java.awt.*;

public class Dum {
    int x, y, size;

    public Dum(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(Graphics g) {
        int houseHeight = size;
        int roofHeight = size / 2;


        int[] xPoints = {x, x + size / 2, x + size};
        int[] yPoints = {y + roofHeight, y, y + roofHeight};

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));


        g2.setColor(Color.WHITE);
        g2.fillPolygon(xPoints, yPoints, 3);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xPoints, yPoints, 3);


        g2.setColor(Color.WHITE);
        g2.fillRect(x, y + roofHeight, size, houseHeight);
        g2.setColor(Color.BLACK);
        g2.drawRect(x, y + roofHeight, size, houseHeight);
    }


}
