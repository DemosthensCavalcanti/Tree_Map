import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TreeMapDemo extends JFrame {

    private final TreeMapPanel treeMapPanel = new TreeMapPanel();
    private final TreeMapInputPanel inputPanel;

    public TreeMapDemo(String title) {
        super(title);

        inputPanel = new TreeMapInputPanel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, Integer> salesData = inputPanel.getSalesData();
                treeMapPanel.setSalesData(salesData);
            }
        });

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(treeMapPanel, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TreeMapDemo("Tree Map Demo"));
    }
}