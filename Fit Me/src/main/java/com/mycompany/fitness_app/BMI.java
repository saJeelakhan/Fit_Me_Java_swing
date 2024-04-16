/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Study Pc
 */
public class BMI extends JFrame implements ActionListener
{
    JFrame custom;
    JTextField BMITextField, height, weight, resultField, heightin, weightin, resultout;
    JTextArea BMIChartField;
    JPanel Body, end;
    JButton Menu, Clear, calculate;
    float Height, Weight;
    int option;
    public Font MyFont = new Font("Times New Roman", Font.BOLD, 20);

     public BMI()
    {
        custom = new JFrame();
        custom.setSize(500, 600);
        custom.setLayout(null);
        custom.setLocationRelativeTo(null);
        
        BMITextField = new JTextField();
        BMITextField.setText("\t    BODY MASS INDEX");
        BMITextField.setFont(MyFont);
        BMITextField.setBounds(0, 0, 500, 100);
        BMITextField.setForeground(Color.WHITE);
        BMITextField.setBackground(Color.DARK_GRAY);
        BMITextField.setEditable(false);
        BMITextField.setFocusable(false);
        BMITextField.setBorder(null);
        
        BMIChartField = new JTextArea();
        BMIChartField.setText("\n UNDER-WEIGHT <18.5\tNORMAL 18.5-24.5\n OVER-WEIGHT 25-29.9\tOBESITY 30-39.9\n MORBID-OBESITY >40");
        BMIChartField.setFont(MyFont);
        BMIChartField.setBounds(0, 350, 500, 115);
        BMIChartField.setForeground(Color.DARK_GRAY);
        BMIChartField.setBackground(Color.WHITE);
        BMIChartField.setEditable(false);
        BMIChartField.setFocusable(false);
        BMIChartField.setBorder(null);
        
        
        Body = new JPanel();
        Body.setBounds(0, 100, 500, 250);
        Body.setBackground(Color.WHITE);
        Body.setLayout(null);
        Body.setVisible(true);
        Body.setOpaque(true);
        
        
        height = new JTextField("ENTER HEIGHT : ");
        height.setFont(MyFont);
        height.setBounds(50, 60, 180, 35);
        height.setForeground(Color.DARK_GRAY);
        height.setBackground(Color.WHITE);
        height.setEditable(false);
        height.setFocusable(false);
        height.setBorder(null);
        
        heightin = new JTextField();
        heightin.setFont(MyFont);
        heightin.setBounds(250, 60, 150, 35);
        heightin.setForeground(Color.WHITE);
        heightin.setBackground(Color.RED);
        heightin.setBorder(null);
        
        weight = new JTextField("ENTER WEIGHT : ");
        weight.setFont(MyFont);
        weight.setBounds(50, 130, 180, 35);
        weight.setForeground(Color.DARK_GRAY);
        weight.setBackground(Color.WHITE);
        weight.setEditable(false);
        weight.setFocusable(false);
        weight.setBorder(null);
        
        weightin = new JTextField();
        weightin.setFont(MyFont);
        weightin.setBounds(250, 130, 150, 35);
        weightin.setForeground(Color.WHITE);
        weightin.setBackground(Color.RED);
        weightin.setBorder(null);
        
        resultField = new JTextField("BMI VALUE : ");
        resultField.setFont(MyFont);
        resultField.setBounds(50, 200, 180, 35);
        resultField.setForeground(Color.DARK_GRAY);
        resultField.setBackground(Color.WHITE);
        resultField.setEditable(false);
        resultField.setFocusable(false);
        resultField.setBorder(null);
        
        resultout = new JTextField();
        resultout.setFont(MyFont);
        resultout.setBounds(250, 200, 150, 35);
        resultout.setForeground(Color.WHITE);
        resultout.setBackground(Color.RED);
        resultout.setEditable(false);
        resultout.setBorder(null);
        
       
        Body.add(height);
        Body.add(heightin);
        Body.add(weight);
        Body.add(weightin);
        Body.add(resultField); 
        Body.add(resultout);
        
        end = new JPanel();
        end.setBounds(0, 465, 500, 100);
        end.setBackground(Color.DARK_GRAY);
        end.setLayout(null);
        end.setVisible(true);
        end.setOpaque(true);
        end.setBorder(null);
        
        Menu = new JButton("MENU");
        Menu.setFont(MyFont);
        Menu.setBounds(30,10, 100, 50);
        Menu.setFocusable(false);
        Menu.setBorder(BorderFactory.createEmptyBorder());
        Menu.setForeground(Color.RED);
        Menu.setBackground(Color.WHITE);
        Menu.addActionListener(this);
        
        Clear = new JButton("CLEAR");
        Clear.setFont(MyFont);
        Clear.setBounds(350, 10, 100, 50);
        Clear.setFocusable(false);
        Clear.setBorder(BorderFactory.createEmptyBorder());
        Clear.setForeground(Color.RED);
        Clear.setBackground(Color.WHITE);
        Clear.addActionListener(this);
        
        calculate = new JButton("CALCULATE");
        calculate.setFont(MyFont);
        calculate.setBounds(175, 10, 130, 50);
        calculate.setFocusable(false);
        calculate.setBorder(BorderFactory.createEmptyBorder());
        calculate.setForeground(Color.RED);
        calculate.setBackground(Color.WHITE);
        calculate.addActionListener(this);
                
        end.add(Menu);
        end.add(Clear);
        end.add(calculate);
        
        custom.add(BMITextField);
        custom.add(Body);
        custom.add(BMIChartField);
        custom.add(end);
        
        custom.setVisible(true);
        custom.setResizable(false);
        custom.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
     public void setHeight(float h)
     {
         Height = h;
     }
     public void setWeight(float w)
     {
         Weight =  w;
     }
     public float GetHeight()
     {
         return Height;
     }
     public float GetWeight()
     {
         return Weight;
     }
     public float BMICaculation()
     {
         return (Weight / (Height * Height));
     }

    @Override
    public void actionPerformed(ActionEvent e)
    { 
        if(e.getSource() == Menu)
        {
            custom.dispose();
            new Fitness_App(); 
        }
        if(e.getSource() == Clear)
        {
           heightin.setText(" ");
           weightin.setText(" ");
           resultout.setText(" ");  
        }
        if(e.getSource() == calculate)
        {
            String s;
            try
            {
                s = heightin.getText();
                if (s.isEmpty())
                {
                    throw new EmptyFieldException();
                }
                s = weightin.getText();
                if (s.isEmpty())
                {
                    throw new EmptyFieldException();
                }
                setHeight(Float.parseFloat(heightin.getText()));
                setWeight(Float.parseFloat(weightin.getText()));
                resultout.setText(String.valueOf(BMICaculation()));
            }
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Enter float values", null, JOptionPane.INFORMATION_MESSAGE);
                heightin.setText(" ");
                weightin.setText(" ");
                resultout.setText(" "); 
            }
            catch (EmptyFieldException ex)
            {
                JOptionPane.showMessageDialog(this,"Text field / fields empty", null, JOptionPane.INFORMATION_MESSAGE);
                heightin.setText(" ");
                weightin.setText(" ");
                resultout.setText(" "); 
            } 
        }
    }
}
