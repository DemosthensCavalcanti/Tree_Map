import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeMapPanel extends JPanel {

    private final Map<String, Integer> salesData = new HashMap<>();
    private final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.CYAN};

    public void setSalesData(Map<String, Integer> salesData) {
        this.salesData.clear();
        this.salesData.putAll(salesData);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (salesData.isEmpty()) return;

        int totalSales = salesData.values().stream().mapToInt(Integer::intValue).sum();
        int width = getWidth();
        int height = getHeight();
        int x = 0;
        int colorIndex = 0;

        for (Map.Entry<String, Integer> entry : salesData.entrySet()) {
            int sales = entry.getValue();
            int rectWidth = width * sales / totalSales;
            g.setColor(colors[colorIndex % colors.length]);
            g.fillRect(x, 0, rectWidth, height);
            g.setColor(Color.BLACK);
            g.drawRect(x, 0, rectWidth, height);
            g.drawString(entry.getKey(), x + 5, 20);
            x += rectWidth;
            colorIndex++;
        }
    }
}