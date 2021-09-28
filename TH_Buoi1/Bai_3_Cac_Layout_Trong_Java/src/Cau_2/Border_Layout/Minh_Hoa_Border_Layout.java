/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau_2.Border_Layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Minh_Hoa_Border_Layout extends JFrame{
    public void create()
    {
        JPanel p = new JPanel();
        
        p.setLayout(new BorderLayout());
        p.add(new JButton("Button 1"), BorderLayout.CENTER); // giữa
        p.add(new JButton("Button 2"), BorderLayout.NORTH); //bắc
        p.add(new JButton("Button 3"), BorderLayout.SOUTH); //nam
        p.add(new JButton("Button 4"), BorderLayout.EAST);  //đông
        p.add(new JButton("Button 5"), BorderLayout.WEST);  //tây    //bị trùng nên không thây
        p.add(new JButton("Button 6"), BorderLayout.WEST);  //đè lên button 5
        
        add(p);
        setSize(400,400);               //kích thước
        setLocationRelativeTo(null);    //đưa vô giữa
        setVisible(true);               //hiển thị lên
    }
}
