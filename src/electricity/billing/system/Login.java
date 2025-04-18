package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JTextField userText,passwordText;
    Choice loginChoice;

    JButton loginButton,cancelButton,signUpButton;

    Login() {

        super("Login");
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel username = new JLabel("Username:");
        username.setBounds(300,60, 100 , 20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60, 150 , 20);
        add(userText);

        JLabel password = new JLabel("Password:");
        password.setBounds(300,100, 100 , 20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100, 150 , 20);
        add(passwordText);

        JLabel loggin = new JLabel("Login In As:");
        loggin.setBounds(300,140, 100 , 20);
        add(loggin);

        loginChoice = new Choice();
        loginChoice.add("Choose Type");
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140, 150 , 20);
        add(loginChoice);

        loginButton = new JButton("Sign in");
        loginButton.setBounds(330,175, 100 , 20);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(450,175, 100 , 20);
        add(cancelButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(400,210, 100 , 20);
        add(signUpButton);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image imageOne = imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageTwo = new ImageIcon(imageOne);
        JLabel imageLabel = new  JLabel(imageTwo);
        imageLabel.setBounds(10,6,250,250);
        add(imageLabel);

        setSize(600, 300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
