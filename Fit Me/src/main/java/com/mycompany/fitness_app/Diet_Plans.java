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
public class Diet_Plans
{
    String dta = " ";
    public Diet_Plans(char c)
    {
        try
        {    
            FileInputStream input = new FileInputStream("C:\\Users\\Study Pc\\Documents\\NetBeansProjects\\Fitness_App\\Diet_plans.txt");        
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
                                dta = dta + "\n";
                                continue;
                            }
                                dta = dta + String.valueOf((char)i);
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
