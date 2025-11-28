package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){
        super("Bank Management System");
        

        // Frame size first
        setSize(850,480);
        setLocation(450,200);

        setLayout(null);

        // Load and scale image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setSize(120,120);
        add(image);

        setVisible(true);

        int frameWidth = getWidth();
        int frameHeight = getHeight();

        int imgWidth = image.getWidth();
        int imgHeight = image.getHeight();

        int x = (frameWidth - imgWidth) / 2;
        int y = (frameHeight - imgHeight) / 2;

        image.setLocation(x, y);

    }
    public static void main(String[] args) {
        new Login();

    }
}
