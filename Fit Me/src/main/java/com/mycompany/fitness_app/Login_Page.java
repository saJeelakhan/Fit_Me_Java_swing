/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;

import static com.mycompany.fitness_app.UserRegistration.saveUserInfo;
import static com.mycompany.fitness_app.UserRegistration.searchUserInfo;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Study Pc
 */
public class Login_Page extends JFrame implements ActionListener
{
    UserInfo newUser;
    UserInfo searchUser;
    JFrame LoginFrame;
    JTextField titleField, Name, Password, Namein, Passwordin;
    JPanel Body, end;
    JButton signin, clear, login;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);
    
    public Login_Page()
    {
        LoginFrame = new JFrame();
        LoginFrame.setSize(500, 600);
        LoginFrame.setBackground(Color.WHITE);
        LoginFrame.setLayout(null);
        LoginFrame.setLocationRelativeTo(null);
        
        titleField = new JTextField("FITNESS APPLICATION");
        titleField.setFont(MyFont);
        titleField.setBounds(0, 0, 500, 100);
        titleField.setForeground(Color.WHITE);
        titleField.setBackground(Color.DARK_GRAY);
        titleField.setEditable(false);
        titleField.setBorder(BorderFactory.createEmptyBorder());
        titleField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
        Body = new JPanel();
        Body.setBounds(0, 100, 500, 364);
        Body.setBackground(Color.WHITE);
        Body.setLayout(null);
        Body.setVisible(true);
        Body.setOpaque(true);
        
        end = new JPanel();
        end.setBounds(0, 465, 500, 100);
        end.setBackground(Color.DARK_GRAY);
        end.setLayout(null);
        end.setVisible(true);
        end.setOpaque(true);
        end.setBorder(null);
        
        Name = new JTextField("NAME : ");
        Name.setFont(MyFont);
        Name.setBounds(50, 230, 180, 35);
        Name.setForeground(Color.DARK_GRAY);
        Name.setBackground(Color.WHITE);
        Name.setEditable(false);
        Name.setFocusable(false);
        Name.setBorder(null);
        
        Namein = new JTextField();
        Namein.setFont(MyFont);
        Namein.setBounds(250, 230, 180, 35);
        Namein.setForeground(Color.WHITE);
        Namein.setBackground(Color.RED);
        Namein.setBorder(null);
        
        Password = new JTextField("PASSWORD : ");
        Password.setFont(MyFont);
        Password.setBounds(50, 300, 180, 35);
        Password.setForeground(Color.DARK_GRAY);
        Password.setBackground(Color.WHITE);
        Password.setEditable(false);
        Password.setFocusable(false);
        Password.setBorder(null);
        
        Passwordin = new JTextField();
        Passwordin.setFont(MyFont);
        Passwordin.setBounds(250, 300, 180, 35);
        Passwordin.setForeground(Color.WHITE);
        Passwordin.setBackground(Color.RED);
        Passwordin.setBorder(null);
        
        signin = new JButton("SIGNUP");
        signin.setFont(MyFont);
        signin.setBounds(30,10, 100, 50);
        signin.setFocusable(false);
        signin.setBorder(BorderFactory.createEmptyBorder());
        signin.setForeground(Color.RED);
        signin.setBackground(Color.WHITE);
        signin.addActionListener(this);
        
        
        clear = new JButton("CLEAR");
        clear.setFont(MyFont);
        clear.setBounds(350, 10, 100, 50);
        clear.setFocusable(false);
        clear.setBorder(BorderFactory.createEmptyBorder());
        clear.setForeground(Color.RED);
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        
        
        login = new JButton("LOGIN");
        login.setFont(MyFont);
        login.setBounds(175, 10, 130, 50);
        login.setFocusable(false);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setForeground(Color.RED);
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        
        Body.add(Name);
        Body.add(Namein);
        Body.add(Password);
        Body.add(Passwordin);
        
        end.add(signin);
        end.add(login);
        end.add(clear);
        
        LoginFrame.add(titleField);
        LoginFrame.add(Body);
        LoginFrame.add(end);
        
        
        LoginFrame.add(Name);
        LoginFrame.add(Namein);
        
        LoginFrame.add(Password);
        LoginFrame.add(Passwordin);
        
        LoginFrame.setVisible(true);
        LoginFrame.setResizable(false);
        LoginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == clear)
        {
          Namein.setText(" ");
          Passwordin.setText(" ");
        }
        if(e.getSource() == signin)
        {
            newUser = new UserInfo(Namein.getText(), Passwordin.getText());
            saveUserInfo(newUser);
            JOptionPane.showMessageDialog(this, "Your account has been created", null, JOptionPane.INFORMATION_MESSAGE);
            Namein.setText(" ");
            Passwordin.setText(" ");
        }
        if(e.getSource() == login)
        {
            searchUser = new UserInfo(Namein.getText(), Passwordin.getText());
            if(searchUserInfo(searchUser))
            {
                JOptionPane.showMessageDialog(this, "You are logged in", null, JOptionPane.INFORMATION_MESSAGE);
                LoginFrame.dispose();
                new Fitness_App();
            }
            Namein.setText(" ");
            Passwordin.setText(" ");
            
        }  
    }
}
