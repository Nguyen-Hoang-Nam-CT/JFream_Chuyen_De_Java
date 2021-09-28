/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Cau_2_FlowLayout extends JFrame{
    public void create()
    {
        JPanel p = new JPanel();
        
//        FlowLayout ct = new FlowLayout(FlowLayout.CENTER);
//        FlowLayout l = new FlowLayout(FlowLayout.LEFT);
        FlowLayout r = new FlowLayout(FlowLayout.RIGHT);
        
        p.setLayout(r); // mặc định là cennter
        p.add(new JButton("Button 1"));
        p.add(new JButton("Button 2"));
        p.add(new JButton("Button 3"));
        p.add(new JButton("Button 4"));
        p.add(new JButton("Button 5"));
        
        setSize(400,400);
        setLocationRelativeTo(null);
        add(p);
        setVisible(true);
    }
}
