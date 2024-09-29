package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUpService extends JFrame {
    PickUpService(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(5,12,59));
        panel.setBounds(5,5,880,540);
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90,16,160,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(pus);

        JLabel TOC = new JLabel("Type of Car");
        TOC.setBounds(32,97,89,14);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try{
            database d= new database();
            ResultSet resultSet = d.statement.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(0,233,880,250);
        table.setBackground(new Color(5,12,59));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            database d= new database();
            String q = "select * from driver";
            ResultSet resultSet = d.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24,208,46,14);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(165,208,46,14);
        age.setForeground(Color.WHITE);
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(290,208,46,14);
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        JLabel company = new JLabel("Company");
        company.setBounds(400,208,100,14);
        company.setForeground(Color.WHITE);
        panel.add(company);

        JLabel Carname = new JLabel("Car Name");
        Carname.setBounds(530,208,100,14);
        Carname.setForeground(Color.WHITE);
        panel.add(Carname);

        JLabel available = new JLabel("Available");
        available.setBounds(660,208,100,14);
        available.setForeground(Color.WHITE);
        panel.add(available);

        JLabel loacation = new JLabel("Loacation");
        loacation.setBounds(780,208,100,14);
        loacation.setForeground(Color.WHITE);
        panel.add(loacation);

        JButton display = new JButton("Display");
        display.setBounds(200,480,120,30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
                try{
                    database d= new database();
                    ResultSet resultSet = d.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        JButton Back = new JButton("Back");
        Back.setBounds(420,480,120,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
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
        new PickUpService();
    }
}