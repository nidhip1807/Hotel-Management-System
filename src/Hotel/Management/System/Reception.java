package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(260,3,1008,670);
        panel.setBackground(new Color(5,12,59));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,3,250,670);
        panel1.setBackground(new Color(5,12,59));
        add(panel1);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("images/cc.gif"));
        Image i3 = imageIcon3.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(i3);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(100,5,800,678);
        panel.add(label2);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("images/login.png"));
        Image i2 = imageIcon2.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(5,478,250,180);
        panel1.add(label1);

        JButton butnNewCF = new JButton("New Guest Form");
        butnNewCF.setBounds(30,10,200,30);
        butnNewCF.setBackground(Color.BLACK);
        butnNewCF.setForeground(Color.WHITE);
        panel1.add(butnNewCF);
        butnNewCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewGuest();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton butnRoom = new JButton("Room");
        butnRoom.setBounds(30,50,200,30);
        butnRoom.setBackground(Color.BLACK);
        butnRoom.setForeground(Color.WHITE);
        panel1.add(butnRoom);
        butnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton butnDepartment = new JButton("Department");
        butnDepartment.setBounds(30,90,200,30);
        butnDepartment.setBackground(Color.BLACK);
        butnDepartment.setForeground(Color.WHITE);
        panel1.add(butnDepartment);
        butnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton butnAllEI = new JButton("All Employee Info");
        butnAllEI.setBounds(30,130,200,30);
        butnAllEI.setBackground(Color.BLACK);
        butnAllEI.setForeground(Color.WHITE);
        panel1.add(butnAllEI);
        butnAllEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton butnCustI = new JButton("Guest Info");
        butnCustI.setBounds(30,170,200,30);
        butnCustI.setBackground(Color.BLACK);
        butnCustI.setForeground(Color.WHITE);
        panel1.add(butnCustI);
        butnCustI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new GuestInfo();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton butnManaI = new JButton("Manager Info");
        butnManaI.setBounds(30,210,200,30);
        butnManaI.setBackground(Color.BLACK);
        butnManaI.setForeground(Color.WHITE);
        panel1.add(butnManaI);
        butnManaI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton butnCheckO = new JButton("Check Out");
        butnCheckO.setBounds(30,250,200,30);
        butnCheckO.setBackground(Color.BLACK);
        butnCheckO.setForeground(Color.WHITE);
        panel1.add(butnCheckO);
        butnCheckO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton butnUCID = new JButton("Update Check-In Details");
        butnUCID.setBounds(30,290,200,30);
        butnUCID.setBackground(Color.BLACK);
        butnUCID.setForeground(Color.WHITE);
        panel1.add(butnUCID);
        butnUCID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckInUpdate();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton butnUpdateRS = new JButton("Update Room Status");
        butnUpdateRS.setBounds(30,330,200,30);
        butnUpdateRS.setBackground(Color.BLACK);
        butnUpdateRS.setForeground(Color.WHITE);
        panel1.add(butnUpdateRS);
        butnUpdateRS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton butnPickUS = new JButton("Pick up Service");
        butnPickUS.setBounds(30,370,200,30);
        butnPickUS.setBackground(Color.BLACK);
        butnPickUS.setForeground(Color.WHITE);
        panel1.add(butnPickUS);
        butnPickUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUpService();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton butnSearchR = new JButton("Search Room");
        butnSearchR.setBounds(30,410,200,30);
        butnSearchR.setBackground(Color.BLACK);
        butnSearchR.setForeground(Color.WHITE);
        panel1.add(butnSearchR);
        butnSearchR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,445,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(135,445,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1980,1090);
        setVisible(true );

    }

    public static void main(String[] args){
        new Reception();

    }
}
