import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Requirement: Class declaration extending JFrame (Inheritance)
public class SwingAssignment extends JFrame {

    // Component variables
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton changeTextBtn;
    private JButton changeBgBtn;

    // Requirement: Implementation of Constructor
    public SwingAssignment() {
        // 1. Assign frame reference to this JFrame instance
        frame = this;

        // 2. Configure JFrame properties
        frame.setTitle("Java Swing Assignment");                       // Window title
        frame.setSize(800, 800);                                       // Size: 800x800 pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           // Close on 'X' click
        frame.setLayout(new FlowLayout());

        // 3. Implement ImageIcon for custom app icon
        try {
            ImageIcon appIcon = new ImageIcon("icon.png");
            frame.setIconImage(appIcon.getImage());
        } catch (Exception e) {
            System.out.println("Custom icon not found.");
        }

        // 4. Instantiate JPanel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(750, 700));
        panel.setBackground(Color.LIGHT_GRAY);

        // 5. Instantiate JLabel with full name
        label = new JLabel("Welcome to Java Swing First Individual Assignment by Alfred Alpha Aruna Koroma");
        label.setFont(new Font("Tahoma", Font.BOLD, 13));

        // 6. Create buttons for additional interactive functionality
        changeTextBtn = new JButton("Change Text");
        changeBgBtn = new JButton("Change Background Color");

        // Click action: Change JLabel text
        changeTextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Success! JLabel text has been updated.");
            }
        });

        // Click action: Change JPanel background color
        changeBgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
            }
        });

        // 7. Add components to panel
        panel.add(label);
        panel.add(changeTextBtn);
        panel.add(changeBgBtn);

        // 8. Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }

    // Main execution entry point
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAssignment();
            }
        });
    }
}