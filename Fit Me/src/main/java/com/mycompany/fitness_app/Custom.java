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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Custom extends JFrame implements ActionListener
{
    JFrame custom;
    JTextField customField, workoutoptions, dietoptions;
    JPanel Body, bottom, end;
    JRadioButton wrb1, wrb2, wrb3, wrb4, wrb5, drb1, drb2, drb3, drb4;
    JButton Menu, selection, Close;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);
    
    public Custom()
    {
        custom = new JFrame();
        custom.setSize(500, 600);
        custom.setLayout(null);
        custom.setLocationRelativeTo(null);
        
        customField = new JTextField();
        customField.setText("\t    CUSTOMIZE PLAN");
        customField.setFont(MyFont);
        customField.setBounds(0, 0, 500, 100);
        customField.setForeground(Color.WHITE);
        customField.setBackground(Color.DARK_GRAY);
        customField.setEditable(false);
        customField.setFocusable(false);
        customField.setBorder(null);
        
        Body = new JPanel();
        Body.setBounds(0, 150, 500, 130);
        Body.setBackground(Color.WHITE);
        Body.setVisible(true);
        Body.setOpaque(true);
        
        workoutoptions = new JTextField();
        workoutoptions.setText("\t   WORKOUTS PLANS");
        workoutoptions.setFont(MyFont);
        workoutoptions.setBounds(0, 100, 500,50);
        workoutoptions.setForeground(Color.DARK_GRAY);
        workoutoptions.setBackground(Color.WHITE);
        workoutoptions.setEditable(false);
        workoutoptions.setFocusable(false);
        workoutoptions.setBorder(null);
        
        dietoptions = new JTextField();
        dietoptions.setText(" \t         DIET PLANS");
        dietoptions.setFont(MyFont);
        dietoptions.setBounds(0, 270, 500,50);
        dietoptions.setForeground(Color.DARK_GRAY);
        dietoptions.setBackground(Color.WHITE);
        dietoptions.setEditable(false);
        dietoptions.setFocusable(false);
        dietoptions.setBorder(null);
      
        bottom = new JPanel();
        bottom.setBounds(0, 315, 500, 150);
        bottom.setBackground(Color.WHITE);
        bottom.setVisible(true);
        bottom.setOpaque(true);
        bottom.setBorder(null);
        
        wrb1 = new JRadioButton("ARMS WORKOUT");
        wrb1.setFont(MyFont);
        wrb1.setBounds(0, 30, 100, 50);
        wrb1.setForeground(Color.RED);
        wrb1.setBackground(Color.WHITE);
        wrb1.setFocusable(false);
        
        wrb2 = new JRadioButton("LEGS WORKOUT");
        wrb2.setFont(MyFont);
        wrb2.setBounds(0, 30, 100, 50);
        wrb2.setForeground(Color.RED);
        wrb2.setBackground(Color.WHITE);
        wrb2.setFocusable(false);
        
        wrb3 = new JRadioButton("ABS WORKOUT");
        wrb3.setFont(MyFont);
        wrb3.setBounds(0, 30, 100, 50);
        wrb3.setForeground(Color.RED);
        wrb3.setBackground(Color.WHITE);
        wrb3.setFocusable(false);
        
        wrb4 = new JRadioButton("CARDIO WORKOUT");
        wrb4.setFont(MyFont);
        wrb4.setBounds(0, 30, 100, 50);
        wrb4.setForeground(Color.RED);
        wrb4.setBackground(Color.WHITE);
        wrb4.setFocusable(false);
        
        wrb5 = new JRadioButton("HIIT WORKOUT");
        wrb5.setFont(MyFont);
        wrb5.setBounds(0, 30, 100, 50);
        wrb5.setForeground(Color.RED);
        wrb5.setBackground(Color.WHITE);
        wrb5.setFocusable(false);
        
        drb1 = new JRadioButton("WEIGHT GAIN PLAN");
        drb1.setFont(MyFont);
        drb1.setBounds(0, 30, 100, 50);
        drb1.setForeground(Color.RED);
        drb1.setBackground(Color.WHITE);
        drb1.setFocusable(false);
        
        drb2 = new JRadioButton("KETO DIET");
        drb2.setFont(MyFont);
        drb2.setBounds(0, 30, 100, 50);
        drb2.setForeground(Color.RED);
        drb2.setBackground(Color.WHITE);
        drb2.setFocusable(false);
        
        drb3 = new JRadioButton("WEIGHT LOSS PLAN");
        drb3.setFont(MyFont);
        drb3.setBounds(0, 30, 100, 50);
        drb3.setForeground(Color.RED);
        drb3.setBackground(Color.WHITE);
        drb3.setFocusable(false);
        
        drb4 = new JRadioButton("INTERMITTENT FAST");
        drb4.setFont(MyFont);
        drb4.setBounds(0, 30, 100, 50);
        drb4.setForeground(Color.RED);
        drb4.setBackground(Color.WHITE);
        drb4.setFocusable(false);
        
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
        
        Close = new JButton("CLOSE");
        Close.setFont(MyFont);
        Close.setBounds(350, 10, 100, 50);
        Close.setFocusable(false);
        Close.setBorder(BorderFactory.createEmptyBorder());
        Close.setForeground(Color.RED);
        Close.setBackground(Color.WHITE);
        Close.setBackground(Color.WHITE);
        Close.addActionListener(this);
        
        
        selection = new JButton("SELECTION");
        selection.setFont(MyFont);
        selection.setBounds(175, 10, 130, 50);
        selection.setFocusable(false);
        selection.setBorder(BorderFactory.createEmptyBorder());
        selection.setForeground(Color.RED);
        selection.setBackground(Color.WHITE);
        selection.addActionListener(this);
                
        Body.add(wrb1);
        Body.add(wrb2);
        Body.add(wrb3);
        Body.add(wrb4);
        Body.add(wrb5);
        
        bottom.add(drb1);
        bottom.add(drb2);
        bottom.add(drb3);
        bottom.add(drb4);
        
        end.add(Menu);
        end.add(selection);
        end.add(Close);
        
        custom.add(customField);
        custom.add(workoutoptions);
        custom.add(Body);
        custom.add(dietoptions);
        custom.add(bottom);
        custom.add(end);
        
        custom.setVisible(true);
        custom.setResizable(false);
        custom.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == Menu)
        {
            custom.dispose();
            new Fitness_App(); 
        }
        if(e.getSource() == Close)
        {
            custom.dispose();
        }
        if(e.getSource() == selection)
        {
            custom.dispose();
            Display D = new Display();
            if((wrb1.isSelected() == false) && (wrb2.isSelected() == false) && (wrb3.isSelected() == false) && (wrb4.isSelected() == false) && (wrb5.isSelected() == false) && (drb1.isSelected() == false) && (drb2.isSelected() == false) && (drb3.isSelected() == false) && (drb4.isSelected() == false))
            {
                
            }
            else
            {
                
                if(wrb1.isSelected())
                {
                    Workout_Plans WP = new Workout_Plans('!');
                    D.TA.setText(D.TA.getText() + WP.ta);
                }
                if (wrb2.isSelected())
                {
                    Workout_Plans WP = new Workout_Plans('@');
                    D.TA.setText(D.TA.getText() + WP.ta);
                }
                if (wrb3.isSelected())
                {
                    Workout_Plans WP = new Workout_Plans('$');
                    D.TA.setText(D.TA.getText() + WP.ta);
                }
                if (wrb4.isSelected())
                {
                    Workout_Plans WP = new Workout_Plans('%');
                    D.TA.setText(D.TA.getText() + WP.ta);
                }
                if (wrb5.isSelected())
                {
                    Workout_Plans WP = new Workout_Plans('&');
                    D.TA.setText(D.TA.getText() + WP.ta);
                }
                if(drb1.isSelected())
                {
                    Diet_Plans DP = new Diet_Plans('+');
                    D.TA.setText(D.TA.getText() + DP.dta);
                }
                if(drb2.isSelected())
                {
                    Diet_Plans DP = new Diet_Plans('$');
                    D.TA.setText(D.TA.getText() + DP.dta);
                }
                if(drb3.isSelected())
                {
                    Diet_Plans DP = new Diet_Plans('-');
                    D.TA.setText(D.TA.getText() + DP.dta);
                }
                if(drb4.isSelected())
                {
                    Diet_Plans DP = new Diet_Plans('*');
                    D.TA.setText(D.TA.getText() + DP.dta);
                }
            }
        }
    } 
}
