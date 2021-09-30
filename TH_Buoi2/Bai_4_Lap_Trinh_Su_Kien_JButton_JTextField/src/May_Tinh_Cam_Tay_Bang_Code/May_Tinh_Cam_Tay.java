/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package May_Tinh_Cam_Tay_Bang_Code;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class May_Tinh_Cam_Tay extends JFrame{

    public void createGUI()
    {
        setLayout(new GridLayout(0,2));
        
        JLabel lblTheFristNumbre = new JLabel("The Frist Numbre"),
               lblTheSecondNumber = new JLabel("The Second Numbre"),
               lblResult = new JLabel("Result ");
        
        JTextField txt1 = new JTextField(),
                   txt2 = new JTextField(),
                   txt3 = new JTextField();
        add(lblTheFristNumbre);
        add(txt1);
        add(lblTheSecondNumber);
        add(txt2);
        add(lblResult);
        add(txt3);
        
        JPanel p = new JPanel();
        Button btnCong = new Button("Cộng"),
               btnTru = new Button("Trừ"),
               btnNhan = new Button("Nhân"),
               btnChia = new Button("Chia");
        p.add(btnCong);
        p.add(btnTru);
        p.add(btnNhan);
        p.add(btnChia);
        add(p);
        
        btnCong.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                txt3.setText("" + (Float.parseFloat(txt1.getText()) + Float.parseFloat(txt2.getText())));
            }
        });
        
        btnTru.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                txt3.setText("" + (Float.parseFloat(txt1.getText()) - Float.parseFloat(txt2.getText())));
            }
        });
        
        btnNhan.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                txt3.setText("" + (Float.parseFloat(txt1.getText()) * Float.parseFloat(txt2.getText())));
            }
        });
        
        btnChia.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(Float.parseFloat(txt2.getText()) == 0)
                    txt3.setText("Không thể chia cho 0");
                else
                    txt3.setText("" + (Float.parseFloat(txt1.getText()) / Float.parseFloat(txt2.getText())));
            }
        });
        
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
}
