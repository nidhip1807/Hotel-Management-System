package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JTextField t1,t3;
    JComboBox t2,t4,t5;
    JButton b1,b2;
    AddRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,740,435);
        panel.setBackground(new Color(5,12,59));
        panel.setLayout(null);
        add(panel);

        JLabel l = new JLabel("Add Rooms");
        l.setBounds(194,15,160,27);
        l.setFont(new Font("Tahoma", Font.BOLD,27));
        l.setForeground(Color.WHITE);
        panel.add(l);

        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(64,70,152,22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        t1 =new JTextField();
        t1.setBounds(200,70,156,20);
        t1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t1.setForeground(Color.WHITE);
        t1.setBackground(new Color(13, 72, 97));
        panel.add(t1);

        JLabel l2 = new JLabel("Availability");
        l2.setBounds(64,110,152,22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 =new JComboBox(new String[] {"Available", "Occupied"});
        t2.setBounds(200,110,156,20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(13,72,97));
        panel.add(t2);

        JLabel l3 = new JLabel("Price");
        l3.setBounds(64,150,152,22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 =new JTextField();
        t3.setBounds(200,150,156,20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(13,72,97));
        panel.add(t3);


        JLabel l4 = new JLabel("Cleaning Status");
        l4.setBounds(64,190,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 =new JComboBox(new String[]{"Cleaned","Dirty"});
        t4.setBounds(200,190,156,20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(13,72,97));
        panel.add(t4);

        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(64,230,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 =new JComboBox(new String[]{"Single Bed","Double Bed"});
        t5.setBounds(200,230,156,20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(13,72,97));
        panel.add(t5);

        b1 = new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("images/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(350,-30,400,400);
        panel.add(label);



        setUndecorated(true);
        setLocation(40,120);
        setLayout(null);
        setSize(750,445);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            try{
                database d = new database();
                String room = t1.getText();
                String ava = (String) t2.getSelectedItem();
                String status = (String)  t4.getSelectedItem();
                String price = t3.getText();
                String type =  (String) t5.getSelectedItem();

                String q = "insert into room values('"+room+"', '"+ava+"',  '"+price+"', '"+status+"', '"+type+"')";
                d.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddRoom();
    }
}