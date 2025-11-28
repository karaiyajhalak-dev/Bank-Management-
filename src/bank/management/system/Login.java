package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

    Login(){
        super("Bank Management System");

        setSize(850, 480);
        setLocation(450, 200);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setSize(120,120);
        add(image);

        // First time center
        centerImage(image);

        // Resize hone par bhi center karne ke liye listener
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                centerImage(image);
            }
        });

        setVisible(true);
    }

    private void centerImage(JLabel img) {
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int imgWidth = img.getWidth();
        int imgHeight = img.getHeight();

        int x = (frameWidth - imgWidth) / 2;
        int y = (frameHeight - imgHeight) / 2;

        img.setLocation(x, y);
    }

    public static void main(String[] args) {
        new Login();
    }
}
