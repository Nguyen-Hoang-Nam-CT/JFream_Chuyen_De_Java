/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyendong;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class RunChuyenDong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Chuyển động nè");
        frame.setSize(657, 400); //640, 360
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ChuyenDong panel_ = new ChuyenDong();
        
        frame.add(panel_);
        
        
        frame.setVisible(true);
        panel_.run();
    }
    
}
