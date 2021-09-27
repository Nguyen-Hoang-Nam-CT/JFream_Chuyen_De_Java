/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau_2.Box_Layout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Minh_Hoa_Box_Layout extends JFrame{
    public void create()
    {
        JPanel p = new JPanel();
        
        p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
        p.add(new JButton("Button 1"));
        p.add(new JButton("Button 2"));
        p.add(new JButton("Button 3"));
        p.add(new JButton("Button 4"));
        p.add(new JButton("Button 5"));
        
//        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
//        p.add(new JButton("Button 6"));
//        p.add(new JButton("Button 7"));
//        p.add(new JButton("Button 8"));
//        p.add(new JButton("Button 9"));
//        p.add(new JButton("Button 10"));
        
        
        add(p);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
