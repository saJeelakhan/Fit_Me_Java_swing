/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;

/**
 *
 * @author Study Pc
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Display extends JFrame implements ActionListener
{
    JFrame custom;
    JTextField title;
    JPanel Body, end;
    JButton Menu, Back, Customize;
    JTextArea TA;
    JScrollPane scrollpane;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);
    
    public Display()
    {
        custom = new JFrame();
        custom.setSize(500, 600);
        custom.setLayout(null);
        custom.setLocationRelativeTo(null);
        
        title = new JTextField();
        title.setText("\tWORKOUT / DIET PLANS ");
        title.setFont(MyFont);
        title.setBounds(0, 0, 500, 100);
        title.setForeground(Color.WHITE);
        title.setBackground(Color.DARK_GRAY);
        title.setEditable(false);
        title.setFocusable(false);
        title.setBorder(null);
        
        Body = new JPanel();
        Body.setBounds(0, 100, 500, 365);
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
        
        Menu = new JButton("  MENU  ");
        Menu.setFont(MyFont);
        Menu.setBounds(30,10, 100, 50);
        Menu.setFocusable(false);
        Menu.setBorder(BorderFactory.createEmptyBorder());
        Menu.setForeground(Color.RED);
        Menu.setBackground(Color.WHITE);
        Menu.addActionListener(this);
        
        Back = new JButton("BACK");
        Back.setFont(MyFont);
        Back.setBounds(350, 10, 100, 50);
        Back.setFocusable(false);
        Back.setBorder(BorderFactory.createEmptyBorder());
        Back.setForeground(Color.RED);
        Back.setBackground(Color.WHITE);
        Back.addActionListener(this);
        
        Customize = new JButton("CUSTOM");
        Customize.setFont(MyFont);
        Customize.setBounds(175, 10, 130, 50);
        Customize.setFocusable(false);
        Customize.setBorder(BorderFactory.createEmptyBorder());
        Customize.setForeground(Color.RED);
        Customize.setBackground(Color.WHITE);
        Customize.addActionListener(this);
        
        TA = new JTextArea();
        TA.setForeground(Color.BLACK);
        TA.setEditable(false);
        scrollpane = new JScrollPane(TA);
        scrollpane.setBounds(0, 0, 485, 365);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setPreferredSize(new Dimension(200,200));
        Body.add(scrollpane);
        
        end.add(Menu);
        end.add(Back);
        end.add(Customize);
        
        custom.add(title);
        custom.add(Body);
        custom.add(end);
        
        custom.setVisible(true);
        custom.setResizable(false);
        custom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Menu)
        {
            custom.dispose();
            new Fitness_App(); 
        }
        if(e.getSource() == Back)
        {
            custom.dispose();
            new Plans(); 
        }
        if(e.getSource() == Customize)
        {
            custom.dispose();
            new Custom();
        }
    }
}
