package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class GuestInfo extends JFrame {
    GuestInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,880,540);
        panel.setBackground(new Color(5,12,59));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,880,450);
        table.setBackground(new Color(5,12,59));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {

            database d= new database();
            String q = "select * from guest";
            ResultSet resultSet = d.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(35,11,100,14);
        id.setForeground(Color.WHITE);
        id.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(137,11,100,14);
        number.setForeground(Color.WHITE);
        number.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(253,11,100,14);
        name.setForeground(Color.WHITE);
        name.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(358,11,100,14);
        gender.setForeground(Color.WHITE);
        gender.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(465,11,100,25);
        country.setForeground(Color.WHITE);
        country.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(570,11,100,14);
        room.setForeground(Color.WHITE);
        room.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(room);

        JLabel Time = new JLabel("CI Time");
        Time.setBounds(680,11,100,14);
        Time.setForeground(Color.WHITE);
        Time.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(796,11,100,25);
        Deposit.setForeground(Color.WHITE);
        Deposit.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Deposit);

        JButton back = new JButton("Back");
        back.setBounds(200,490,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setLocation(330,87);
        setSize(890,550);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GuestInfo();
    }
}