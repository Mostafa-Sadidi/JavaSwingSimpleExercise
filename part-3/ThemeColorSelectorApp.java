import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeColorSelectorApp extends JFrame implements ActionListener {
    private JPanel mainPanel;      // The panel whose background will change
    private JButton redButton;     // Button to select red theme
    private JButton greenButton;   // Button to select green theme
    private JButton blueButton;    // Button to select blue theme

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new ThemeColorSelectorApp();
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    public ThemeColorSelectorApp() {
        setTitle("Theme Color Selector");

        mainPanel = new JPanel();

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":   mainPanel.setBackground(Color.RED);   break;
            case "GREEN": mainPanel.setBackground(Color.GREEN); break;
            case "BLUE":  mainPanel.setBackground(Color.BLUE);  break;
        }
    }
}