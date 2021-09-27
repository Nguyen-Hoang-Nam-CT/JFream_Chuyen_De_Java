/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau_2.Grid_Layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Minh_Hoa_Grid_Layout extends JFrame
{
    public void create()
    {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0,2));
        
        p.add(new JLabel("Nhập tên "));
        p.add(new JTextField());
        
        p.add(new JLabel("Nhập tuổi "));
        p.add(new JTextField());
        
        p.add(new JLabel("Nhập địa chỉ "));
        p.add(new JTextField());
        
        p.add(new JLabel("Nhập giới tính "));
        p.add(new JTextField());
        
        setSize(400, 150);
        setLocationRelativeTo(null);
        add(p);
        setVisible(true);
    }
    public static void main(String[] args) {
        Minh_Hoa_Grid_Layout frame = new Minh_Hoa_Grid_Layout();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.create();
    }
}
