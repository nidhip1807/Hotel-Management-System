package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class AddDriver extends JFrame implements ActionListener {
    JTextField nameText, ageText,car_companyText,car_nameText,locText;
    JComboBox comboBox, comboBox1;
    JButton add, back;
    AddDriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,740,435);
        panel.setBackground(new Color(5,12,59));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,15,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name = new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(174,70,156,20);
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setBackground(new Color(13,72,97));
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD,14));
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(174,110,156,20);
        ageText.setForeground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setBackground(new Color(13,72,97));
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        comboBox = new JComboBox(new String[]{"Male","Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setBackground(new Color(13,72,97));
        panel.add(comboBox);

        JLabel car_company = new JLabel("CAR COMPANY");
        car_company.setBounds(64,190,110,22);
        car_company.setFont(new Font("Tahoma", Font.BOLD,14));
        car_company.setForeground(Color.WHITE);
        panel.add(car_company);
        car_companyText = new JTextField();
        car_companyText.setBounds(174,190,156,20);
        car_companyText.setForeground(Color.WHITE);
        car_companyText.setFont(new Font("Tahoma",Font.BOLD,14));
        car_companyText.setBackground(new Color(13,72,97));
        panel.add(car_companyText);

        JLabel car_name = new JLabel("CAR NAME");
        car_name.setBounds(64,230,102,22);
        car_name.setFont(new Font("Tahoma", Font.BOLD,14));
        car_name.setForeground(Color.WHITE);
        panel.add(car_name);
        car_nameText = new JTextField();
        car_nameText.setBounds(174,230,156,20);
        car_nameText.setForeground(Color.WHITE);
        car_nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        car_nameText.setBackground(new Color(13,72,97));
        panel.add(car_nameText);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64,270,102,22);
        available.setFont(new Font("Tahoma", Font.BOLD,14));
        available.setForeground(Color.WHITE);
        panel.add(available);
        comboBox1 = new JComboBox(new String[]{"YES","NO"});
        comboBox1.setBounds(176,270,154,20);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox1.setBackground(new Color(13,72,97));
        panel.add(comboBox1);

        JLabel loc = new JLabel("LOCATION");
        loc.setBounds(64,310,102,22);
        loc.setFont(new Font("Tahoma", Font.BOLD,14));
        loc.setForeground(Color.WHITE);
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(174,310,156,20);
        locText.setForeground(Color.WHITE);
        locText.setFont(new Font("Tahoma",Font.BOLD,14));
        locText.setBackground(new Color(13,72,97));
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64,380,111,33);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("images/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(440,80,200,200);
        panel.add(label1);

        setUndecorated(true);
        setLocation(40,120);
        setLayout(null);
        setSize(750,445);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = car_companyText.getText();
            String carname = car_nameText.getText();
            String available =(String)  comboBox1.getSelectedItem();
            String location = locText.getText();

            try{
                database d = new database();
                String q = "insert into driver values('"+name+"','"+age+"', '"+gender+"', '"+company+"', '"+carname+"','"+available+"', '"+location+"')";
                d.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Driver Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddDriver();
    }
}