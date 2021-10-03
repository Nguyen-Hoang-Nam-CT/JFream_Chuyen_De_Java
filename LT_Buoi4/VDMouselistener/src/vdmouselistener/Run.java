/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdmouselistener;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Run 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(417, 440);
        frame.setLocationRelativeTo(null);
        
        VDMouselistener panel = new VDMouselistener();
        panel.addMouseListener(panel); // phải có lênh này mới nhận được click
        
        frame.add(panel);
        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
