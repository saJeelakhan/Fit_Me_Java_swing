/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness_app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Study Pc
 */
public class UserRegistration
{
    public static void saveUserInfo(UserInfo user) {
        try {
            FileOutputStream fileOut = new FileOutputStream("userinfo.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(user);
            objectOut.close();
            fileOut.close();
            System.out.println("User information has been saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving user information: " + e.getMessage());
        }
    }
    
    public static boolean searchUserInfo(UserInfo user) {
        try {
            FileInputStream fileIn = new FileInputStream("userinfo.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            UserInfo savedUser = (UserInfo) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            
            if (user.getName().equals(savedUser.getName()) && user.getPassword().equals(savedUser.getPassword())) {
                System.out.println("User information found.");
                return true;
            } else {
                System.out.println("User information not found.");
                return false;
            }
        } catch (FileNotFoundException e) {
            System.out.println("User information file not found.");
            return false;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while searching for user information: " + e.getMessage());
            return false;
        }
    }
}
