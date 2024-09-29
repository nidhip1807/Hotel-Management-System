package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton add,rec;

    Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM");

        rec = new JButton("RECEPTION");
        rec.setBounds(325, 440, 140,30);
        rec.setFont(new Font("Tahoma", Font.BOLD, 15));
        rec.setBackground(new Color(28,203,58));
        rec.setForeground(Color.white);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(770, 440, 140,30);
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBackground(new Color(28,203,58));
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("images/boss.png"));
        Image i2 = imageIcon2.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(750,240,175,190);
        add(label1);


        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("images/Reception.png"));
        Image i3 = imageIcon3.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(i3);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(308,245,175,190);
        add(label2);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("images/Dashboard.gif"));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        Image i1 = imageIcon.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, screenSize.width, screenSize.height);
        add(label);


        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == rec){
            new Reception();
            setVisible(false);
        }else{
            new login2();
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Dashboard();

    }

}
