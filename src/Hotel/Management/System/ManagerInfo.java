package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {
    ManagerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,880,540);
        panel.setBackground(new Color(5,12,59));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,34,880,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(5,12,59));
        panel.add(table);

        try {
            database d = new database();
            String q = "select * from Employee where job = 'Manager'";
            ResultSet resultSet = d.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(200,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(35,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel Age = new JLabel("Age");
        Age.setBounds(149,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(253,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(358,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(470,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(570,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel sin = new JLabel("SIN");
        sin.setBounds(695,11,70,19);
        sin.setForeground(Color.WHITE);
        sin.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(sin);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(796,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);


        setUndecorated(true);
        setLayout(null);
        setLocation(330,87);
        setSize(890,550);
        setVisible(true);

    }
    public static void main(String[] args) {
        new ManagerInfo();
    }
}
