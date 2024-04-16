/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Study Pc
 */
public class Workout_Plans
{
    String ta = " ";
    
    public Workout_Plans(char c)
    {
        try
        {    
            FileInputStream input = new FileInputStream("C:\\Users\\Study Pc\\Documents\\NetBeansProjects\\Fitness_App\\Workout.txt");        
            int i;    
            while((i = input.read())!=-1)
               {
                   if((char)i == c)
                   {
                       while((char)i != '#')
                       {
                           i = input.read();
                           if(i == '#')
                           {
                               continue;
                           }
                           if(i == '.')
                            {
                                ta = ta + "\n";
                                continue;
                            }
                                ta = ta + String.valueOf((char)i);
                       }
                       break;
                   }
                }
            input.close();
        }
        catch(IOException e)
        {
            System.out.println(e);    
        }
    } 
}
