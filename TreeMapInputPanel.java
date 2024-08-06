import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class TreeMapInputPanel extends JPanel {

    private final JTextField samsungField = new JTextField();
    private final JTextField appleField = new JTextField();
    private final JTextField xiaomiField = new JTextField();
    private final JTextField motorolaField = new JTextField();
    private final JTextField outrosField = new JTextField();

    private final JButton generateButton = new JButton("Gerar Tree Map");

    public TreeMapInputPanel(ActionListener listener) {
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Samsung:"));
        add(samsungField);
        add(new JLabel("Apple:"));
        add(appleField);
        add(new JLabel("Xiaomi:"));
        add(xiaomiField);
        add(new JLabel("Motorola:"));
        add(motorolaField);
        add(new JLabel("Outros:"));
        add(outrosField);

        generateButton.addActionListener(listener);
        add(generateButton);
    }

    public Map<String, Integer> getSalesData() {
        Map<String, Integer> salesData = new HashMap<>();
        salesData.put("Samsung", Integer.parseInt(samsungField.getText()));
        salesData.put("Apple", Integer.parseInt(appleField.getText()));
        salesData.put("Xiaomi", Integer.parseInt(xiaomiField.getText()));
        salesData.put("Motorola", Integer.parseInt(motorolaField.getText()));
        salesData.put("Outros", Integer.parseInt(outrosField.getText()));
        return salesData;
    }
}