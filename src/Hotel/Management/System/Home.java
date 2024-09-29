package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame{
    Home(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("images/main.png"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,600);
        add(label);

        JLabel textLabel = new JLabel("Hotel Management System");
        textLabel.setBounds(400,70,400, 50);
        textLabel.setFont(new Font("Itallic", Font.BOLD, 30));
        textLabel.setOpaque(true); // This is necessary to make the background visible
        textLabel.setBackground(Color.BLACK);
        textLabel.setForeground(Color.WHITE);
        label.add(textLabel);

        setLayout(null);
        setLocation(210,47);
        setSize(858,600);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){new Home();
    }
}


