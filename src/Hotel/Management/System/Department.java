package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Department extends JFrame {
    Department(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(5,12,59));
        panel.setBounds(5,5,880,540);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,890,350);
        table.setBackground(new Color(5,12,59));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            database d = new database();
            String departmentInfo = "select * from department";
            ResultSet resultSet = d.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(200,480,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Department");
        label1.setBounds(100,11,105,20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD,16));
        panel.add(label1);


        JLabel label2 = new JLabel("Budget");
        label2.setBounds(680,11,105,20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD,16));
        panel.add(label2);


        JLabel label3 = new JLabel("Sub-Division");
        label3.setBounds(392, 11, 105, 20); // Adjust the bounds as necessary
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(label3);



        setUndecorated(true);
        setLayout(null);
        setLocation(330,87);
        setSize(890,550);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Department();
    }
}
