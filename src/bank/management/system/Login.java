package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    JPanel panel;

    Login() {
        super("Bank Management System");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 480);
        setLocationRelativeTo(null);      // Center window initially
        setLayout(new BorderLayout());

        // -------- Background --------
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel background = new JLabel(iii3);
        add(background);
        background.setLayout(new GridBagLayout());   // Center components

        // -------- CENTER PANEL --------
        panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(600, 350));
        panel.setOpaque(false); // transparent

        // Bank Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(250, 0, 100, 100);
        panel.add(image);

        // Card icon
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        JLabel iimage = new JLabel(new ImageIcon(ii2));
        iimage.setBounds(430, 250, 100, 100);
        panel.add(iimage);

        // Texts & Buttons
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 32));
        label1.setBounds(150, 100, 350, 40);
        panel.add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Raleway", Font.BOLD, 26));
        label2.setForeground(Color.WHITE);
        label2.setBounds(100, 160, 200, 30);
        panel.add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(250, 160, 250, 30);
        panel.add(textField2);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Raleway", Font.BOLD, 26));
        label3.setForeground(Color.WHITE);
        label3.setBounds(100, 210, 200, 30);
        panel.add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(250, 210, 250, 30);
        panel.add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setBounds(200, 260, 100, 30);
        button1.addActionListener(this);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        panel.add(button1);

        button2 = new JButton("CLEAR");
        button2.setBounds(320, 260, 100, 30);
        button2.addActionListener(this);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        panel.add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBounds(200, 300, 220, 30);
        button3.addActionListener(this);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        panel.add(button3);

        // Add panel to background (center)
        background.add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                // login code
            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                // signup code
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
    }
}
