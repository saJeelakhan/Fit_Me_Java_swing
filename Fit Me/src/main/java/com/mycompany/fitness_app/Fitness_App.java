package com.mycompany.fitness_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fitness_App extends JFrame implements MouseListener
{
    JFrame MainFrame;
    JButton BMI, WorkDietButton, custom;
    JTextField titleField;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);
    
    public Fitness_App()
    {
        MainFrame = new JFrame();
        MainFrame.setSize(500, 600);
        MainFrame.setBackground(Color.DARK_GRAY);
        MainFrame.setLayout(new GridLayout(4, 1));
        MainFrame.setLocationRelativeTo(null);
        
        titleField = new JTextField("FITNESS APPLICATION");
        titleField.setFont(MyFont);
        titleField.setBounds(0, 0, 500, 100);
        titleField.setForeground(Color.WHITE);
        titleField.setBackground(Color.RED);
        titleField.setEditable(false);
        titleField.setBorder(BorderFactory.createEmptyBorder());
        titleField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
           
        BMI = new JButton("BMI CALCULATOR");
        BMI.setFont(MyFont);
        BMI.setForeground(Color.RED);
        BMI.setBackground(Color.WHITE);
        BMI.setBorder(BorderFactory.createEmptyBorder());
        BMI.setFocusable(false);
        BMI.addMouseListener(this);
        
        
        custom = new JButton("CUSTOMIZE PLANS");
        custom.setFont(MyFont);
        custom.setSize(500, 100);
        custom.setForeground(Color.RED);
        custom.setBackground(Color.WHITE);
        custom.setBorder(BorderFactory.createEmptyBorder());
        custom.setFocusable(false);
        custom.addMouseListener(this);
        
        
        WorkDietButton = new JButton("WORKOUT/DIET PLANS");
        WorkDietButton.setFont(MyFont);
        WorkDietButton.setSize( 20, 20);
        WorkDietButton.setForeground(Color.RED);
        WorkDietButton.setBackground(Color.WHITE);
        WorkDietButton.setBorder(BorderFactory.createEmptyBorder());
        WorkDietButton.setFocusable(false);
        WorkDietButton.addMouseListener(this);
         
        
        MainFrame.add(titleField);
        MainFrame.add(BMI);
        MainFrame.add(WorkDietButton);
        MainFrame.add(custom);
        
      
        MainFrame.setVisible(true);
        MainFrame.setResizable(false);
        MainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        
       new Login_Page();

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
      if(e.getSource() == BMI)
        {
            BMI.setBackground(Color.DARK_GRAY);
            MainFrame.dispose();
            new BMI();
            
        }
        if (e.getSource() == custom)
        {
            custom.setBackground(Color.DARK_GRAY);
            MainFrame.dispose();
            new Custom();
            
        }
        if (e.getSource() == WorkDietButton)
        {
            WorkDietButton.setBackground(Color.DARK_GRAY);
            MainFrame.dispose();
            new Plans();
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        if(e.getSource() == BMI)
        {
            BMI.setBackground(Color.red);
            BMI.setForeground(Color.WHITE);
        }
        if (e.getSource() == custom)
        {
            custom.setBackground(Color.red);
            custom.setForeground(Color.WHITE);
        }
        if (e.getSource() == WorkDietButton)
        {
            WorkDietButton.setBackground(Color.red);
            WorkDietButton.setForeground(Color.WHITE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        if(e.getSource() == BMI)
        {
            BMI.setBackground(Color.WHITE);
            BMI.setForeground(Color.RED);
        }
        if (e.getSource() == custom)
        {
            custom.setBackground(Color.WHITE);
            custom.setForeground(Color.red);
        }
        if (e.getSource() == WorkDietButton)
        {
            WorkDietButton.setBackground(Color.WHITE);
            WorkDietButton.setForeground(Color.red);
        }
        
    }
}
