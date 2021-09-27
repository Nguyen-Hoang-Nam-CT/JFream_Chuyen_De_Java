/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau_3;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.GridLayout;


public class Cau_3_Grid_Layout extends JFrame   
{

    
    public void create()
    {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0,2));
        p.add(new JLabel("User name "));
        p.add(new JTextField());
        
        p.add(new JLabel("Password "));
        p.add(new JPasswordField());
        
        p.add(new JLabel("Confirm password "));
        p.add(new JPasswordField());
        
        p.add(new JButton("Login"));
        p.add(new JButton("Register"));
        
        setSize(400,150);
        setLocationRelativeTo(null);
        add(p);
        setVisible(true);
    }
}
