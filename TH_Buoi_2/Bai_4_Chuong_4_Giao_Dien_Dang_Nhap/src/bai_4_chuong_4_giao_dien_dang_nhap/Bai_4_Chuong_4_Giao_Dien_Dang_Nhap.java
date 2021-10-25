/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4_chuong_4_giao_dien_dang_nhap;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Bai_4_Chuong_4_Giao_Dien_Dang_Nhap extends JFrame{
    
    JButton btnSubmit = new JButton("login");
    JTextField txtUsername = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    
    public void createGUI()
    {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0,2));
        p.add(new JLabel("Username"));
        p.add(txtUsername);
        
        p.add(new JLabel("Passworld"));
        p.add(txtPassword);
        
        add(p, BorderLayout.NORTH);
        

        add(btnSubmit, BorderLayout.CENTER);
        
        
        setSize(250,105);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
