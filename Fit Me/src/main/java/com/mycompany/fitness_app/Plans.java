/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;

/**
 *
 * @author Study Pc
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Plans extends JFrame implements ActionListener
{
    JFrame plans;
    JTextField title, workouttf, diettf;
    JPanel space, end;
    JButton Close, Menu, Customize, b1, b2, b3, b4, b5, wb1, wb2, wb3, wb4;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);
    
    public Plans()
    {
        plans = new JFrame();
        plans.setSize(500, 600);
        plans.setLayout(null);
        plans.setLocationRelativeTo(null);
        
        title = new JTextField("                   WORKOUT/DIETARY PLANS");
        title.setFont(MyFont);
        title.setBounds(0, 0, 500, 100);
        title.setBackground(Color.DARK_GRAY);
        title.setForeground(Color.WHITE);
        title.setFocusable(false);
        title.setEditable(false);
        
        space = new JPanel();
        space.setBounds(0, 100, 500, 365);
        space.setBackground(Color.WHITE);
        space.setLayout(null);
        space.setVisible(true);
        space.setOpaque(true);
        
        workouttf = new JTextField("   WORKOUTS");
        workouttf.setFont(MyFont);
        workouttf.setBounds(20, 20, 150, 20);
        workouttf.setBackground(Color.WHITE);
        workouttf.setForeground(Color.DARK_GRAY);
        workouttf.setBorder(null);
        workouttf.setFocusable(false);
        workouttf.setEditable(false);
        
        b1 = new JButton("1- ARMS WORKOUT");
        b1.setFont(MyFont);
        b1.setBounds(20, 50, 200, 30);
        b1.setForeground(Color.RED);
        b1.setBackground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        
        b2 = new JButton("2- LEGS WORKOUT");
        b2.setFont(MyFont);
        b2.setBounds(20, 100, 200, 30);
        b2.setForeground(Color.RED);
        b2.setBackground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        
        b3 = new JButton("3- ABS WORKOUT");
        b3.setFont(MyFont);
        b3.setBounds(20, 150, 200, 30);
        b3.setForeground(Color.RED);
        b3.setBackground(Color.WHITE);
        b3.setFocusable(false);
        b3.addActionListener(this);
        
        b4 = new JButton("4- CARDIO WORKOUT");
        b4.setFont(MyFont);
        b4.setBounds(20, 200, 200, 30);
        b4.setForeground(Color.RED);
        b4.setBackground(Color.WHITE);
        b4.setFocusable(false);
        b4.addActionListener(this);
        
        b5 = new JButton("5- HIIT WORKOUT");
        b5.setFont(MyFont);
        b5.setBounds(20, 250, 200, 30);
        b5.setForeground(Color.RED);
        b5.setBackground(Color.WHITE);
        b5.setFocusable(false);
        b5.addActionListener(this);
        
        diettf = new JTextField("   DIETS");
        diettf.setFont(MyFont);
        diettf.setBounds(260, 20, 150, 20);
        diettf.setBackground(Color.WHITE);
        diettf.setForeground(Color.DARK_GRAY);
        diettf.setBorder(null);
        diettf.setFocusable(false);
        diettf.setEditable(false);
        
        wb1 = new JButton("1- WEIGHT GAIN PLAN");
        wb1.setFont(MyFont);
        wb1.setBounds(260, 50, 200, 30);
        wb1.setForeground(Color.RED);
        wb1.setBackground(Color.WHITE);
        wb1.setFocusable(false);
        wb1.addActionListener(this);
        
        wb2 = new JButton("2- KETO DIET");
        wb2.setFont(MyFont);
        wb2.setBounds(260, 100, 200, 30);
        wb2.setForeground(Color.RED);
        wb2.setBackground(Color.WHITE);
        wb2.setFocusable(false);
        wb2.addActionListener(this);
        
        wb3 = new JButton("3- WEIGHT LOSS PLAN");
        wb3.setFont(MyFont);
        wb3.setBounds(260, 150, 200, 30);
        wb3.setForeground(Color.RED);
        wb3.setBackground(Color.WHITE);
        wb3.setFocusable(false);
        wb3.addActionListener(this);
        
        wb4 = new JButton("4- INTERMITTENT FASTING");
        wb4.setFont(MyFont);
        wb4.setBounds(260, 200, 200, 30);
        wb4.setForeground(Color.RED);
        wb4.setBackground(Color.WHITE);
        wb4.setFocusable(false);
        wb4.addActionListener(this);
        
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
        
        Customize = new JButton("CUSTOM");
        Customize.setFont(MyFont);
        Customize.setBounds(175, 10, 130, 50);
        Customize.setFocusable(false);
        Customize.setBorder(BorderFactory.createEmptyBorder());
        Customize.setForeground(Color.RED);
        Customize.setBackground(Color.WHITE);
        Customize.addActionListener(this);
        
        Close = new JButton("CLOSE");
        Close.setFont(MyFont);
        Close.setBounds(350, 10, 100, 50);
        Close.setFocusable(false);
        Close.setBorder(BorderFactory.createEmptyBorder());
        Close.setForeground(Color.RED);
        Close.setBackground(Color.WHITE);
        Close.addActionListener(this);
        
        
        space.add(workouttf);
        space.add(b1);
        space.add(b2);
        space.add(b3);
        space.add(b4);
        space.add(b5);
        
        space.add(diettf);
        space.add(wb1);
        space.add(wb2);
        space.add(wb3);
        space.add(wb4);
        
        end.add(Menu);
        end.add(Customize);
        end.add(Close);
        
        plans.add(title);
        plans.add(space);
        plans.add(end);
        plans.setVisible(true);
        plans.setResizable(false);
        plans.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Menu)
        {
            plans.dispose();
            new Fitness_App(); 
        }
        if(e.getSource() == Customize)
        {
            plans.dispose();
            new Custom();
        }
        if(e.getSource() == Close)
        {
            plans.dispose();
        }
        if(e.getSource() == wb1)
        {
            Diet_Plans DP = new Diet_Plans('+');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(DP.dta);
        }
        if (e.getSource() == wb2)
        {
            Diet_Plans DP = new Diet_Plans('$');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(DP.dta);
        }
        if (e.getSource() == wb3)
        {
            Diet_Plans DP = new Diet_Plans('-');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(DP.dta);
        }
        if (e.getSource() == wb4)
        {
            Diet_Plans DP = new Diet_Plans('*');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(DP.dta);
        }
        if (e.getSource() == b1)
        {
            Workout_Plans WP = new Workout_Plans('!');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(WP.ta);
        }
        if (e.getSource() == b2)
        {
            Workout_Plans WP = new Workout_Plans('@');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(WP.ta);
        }
        if (e.getSource() == b3)
        {
            Workout_Plans WP = new Workout_Plans('$');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(WP.ta);
        }
        if (e.getSource() == b4)
        {
            Workout_Plans WP = new Workout_Plans('%');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(WP.ta);
        }
        if (e.getSource() == b5)
        {
            Workout_Plans WP = new Workout_Plans('&');
            plans.dispose();
            Display D = new Display();
            D.TA.setText(WP.ta);
        }
    }
}
