package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, sinText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,740,435);
        panel.setLayout(null);
        panel.setBackground(new Color(5,12,59));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,20,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,20,150,27);
        nameText.setBackground(new Color(13,72,97));
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,60,150,27);
        Age.setFont(new Font("serif", Font.BOLD, 17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,60,150,27);
        ageText.setBackground(new Color(13,72,97));
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,105,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,105,70,27);
        radioButtonM.setBackground(new Color(5, 12, 59));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,105,100,27);
        radioButtonF.setBackground(new Color(5, 12, 59));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,150,130,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk", "Housekeeping", "Kitchen Staff","Room Service", "Manager", "Accountant","Chef"});
        comboBox.setBackground(new Color(13,72,97));
        comboBox.setBounds(200,150,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,200,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,200,150,27);
        salaryText.setBackground(new Color(13,72,97));
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,250,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,250,150,27);
        phoneText.setBackground(new Color(13,72,97));
        phoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel sin = new JLabel("SIN");
        sin.setBounds(60,300,150,27);
        sin.setFont(new Font("serif", Font.BOLD, 17));
        sin.setForeground(Color.WHITE);
        panel.add(sin);
        sinText = new JTextField();
        sinText.setBounds(200,300,150,27);
        sinText.setBackground(new Color(13,72,97));
        sinText.setFont(new Font("Tahoma", Font.BOLD,14));
        sinText.setForeground(Color.WHITE);
        panel.add(sinText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,350,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,350,150,27);
        emailText.setBackground(new Color(13,72,97));
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(380,15,400,30);
        AED.setFont(new Font("Tahoma", Font.BOLD, 27));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,400,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,400,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("images/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(450,100,220,250);
        panel.add(label);


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
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String sin = sinText.getText();
            String email = emailText.getText();

            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = " Female";
            }

            try{
                database d = new database();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+sin+"', '"+email+"')";
                d.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}