package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Signup extends JFrame implements ActionListener {

    Choice loginAscho;
    TextField meterText,employerText,usernameText,nameText,passwordText;
    JButton create,back;

    Signup() {

        super("Signup");
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel createAs = new JLabel("Create Account As");
        createAs.setBounds(30,50, 125, 20);
        add(createAs);

        loginAscho = new Choice();
        loginAscho.add("Choice");
        loginAscho.add("Admin");
        loginAscho.add("Customer");
        loginAscho.setBounds(180,50,125,20);
        add(loginAscho);

        JLabel meterNumber = new JLabel("Meter Number");
        meterNumber.setBounds(30,100,125,20);
        meterNumber.setVisible(false);
        add(meterNumber);

        meterText = new TextField();
        meterText.setBounds(180,100,125,20);
        meterNumber.setVisible(false);
        add(meterText);

        JLabel Employer = new JLabel("Employer ID");
        Employer.setBounds(30,100,125,20);
        Employer.setVisible(true);
        add(Employer);

        employerText = new TextField();
        employerText.setBounds(180,100,125,20);
        Employer.setVisible(true);
        add(employerText);

        JLabel username = new JLabel("Username");
        username.setBounds(30,140,125,20);
        add(username);

        usernameText = new TextField();
        usernameText.setBounds(180,140,125,20);
        add(usernameText);

        JLabel name = new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);

        nameText = new TextField();
        nameText.setBounds(180,180,125,20);
        add(nameText);

        JLabel password = new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        passwordText = new TextField();
        passwordText.setBounds(180,220,125,20);
        add(passwordText);

        loginAscho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginAscho.getSelectedItem();

                if (user.equals("Customer")) {
                    Employer.setVisible(false);
                    employerText.setVisible(false);
                    meterNumber.setVisible(true);
                    meterText.setVisible(true);
                }
                else{
                    Employer.setVisible(true);
                    employerText.setVisible(true);
                    meterNumber.setVisible(false);
                    meterText.setVisible(false);
                }

            }
        });

        create = new JButton("Create");
        create.setBounds(50,275,100,25);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBounds(180,275,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image imageOne = imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageTwo = new ImageIcon(imageOne);
        JLabel imageLabel = new  JLabel(imageTwo);
        imageLabel.setBounds(330,30,250,250);
        add(imageLabel);

        setSize(600, 380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==create){

        }
        else if(e.getSource()==back){
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }

}
